import javax.swing.JFrame

class App(title: String?) : JFrame(title)
{

}

fun main()
{
    val app = App("Hello snap world!")
    app.setSize(300, 300)
    app.show()
}