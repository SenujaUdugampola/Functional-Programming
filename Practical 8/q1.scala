import scala.io.StdIn.{readLine, readInt}

  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def decrypt(text: String, shift: Int): String = {
    encrypt(text, 26 - shift)
  }

  def cipher(text: String, shift: Int): Unit = {
    val encryptedText = encrypt(text, shift)
    val decryptedText = decrypt(encryptedText, shift)

    println(s"Encrypted Text: $encryptedText")
    println(s"Decrypted Text: $decryptedText")
  }

  @main def runCaesarCipher(): Unit = {
    println("Please enter the text:")
    val text: String = readLine()

    println("Please enter the shift value:")
    val shift: Int = readInt()

    cipher(text, shift)
  }

