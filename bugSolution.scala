```scala
class MyClass(val x: Int) {
  def this(s: String) = {
    try {
      this(s.toInt)
    } catch {
      case e: NumberFormatException =>
        println("Error: Invalid input string. Using default value.")
        this(0) // Or another appropriate default value
    }
  }
}
```