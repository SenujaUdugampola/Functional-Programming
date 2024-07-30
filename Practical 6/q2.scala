import scala.io.StdIn.readLine

  @main def main(): Unit = {
    val studentInfo = getStudentInfoWithRetry()
    printStudentRecord(studentInfo)
  }

  def getStudentInfo(name: String, marks: Int, totalMarks: Int): (String, Int, Int, Double, Char) = {
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = if (percentage >= 90) 'A'
                else if (percentage >= 75) 'B'
                else if (percentage >= 50) 'C'
                else 'D'

    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Possible Marks: $totalMarks")
    println(s"Percentage: $percentage")
    println(s"Grade: $grade")
  }

  def validateInput(name: String, marks: String, totalMarks: String): (Boolean, Option[String]) = {
    if (name.isEmpty) return (false, Some("Name cannot be empty"))
    
    val marksInt = try {
      marks.toInt
    } catch {
      case _: NumberFormatException => return (false, Some("Marks must be a positive integer"))
    }

    val totalMarksInt = try {
      totalMarks.toInt
    } catch {
      case _: NumberFormatException => return (false, Some("Total possible marks must be a positive integer"))
    }

    if (marksInt < 0 || totalMarksInt < 0) {
      return (false, Some("Marks and total possible marks must be positive integers"))
    }

    if (marksInt > totalMarksInt) {
      return (false, Some("Marks cannot exceed total possible marks"))
    }

    (true, None)
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var errorMessage: Option[String] = None
    var name, marks, totalMarks = ""

    while (!isValid) {
      name = readLine("Enter student's name: ")
      marks = readLine("Enter marks obtained: ")
      totalMarks = readLine("Enter total possible marks: ")

      val validation = validateInput(name, marks, totalMarks)
      isValid = validation._1
      errorMessage = validation._2

      if (!isValid) {
        println(s"Invalid input: ${errorMessage.get}")
      }
    }

    val marksInt = marks.toInt
    val totalMarksInt = totalMarks.toInt
    getStudentInfo(name, marksInt, totalMarksInt)
  }
