import kotlinx.browser.document
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLInputElement

fun main() {
    val input = document.getElementById("input") as HTMLInputElement
    val button = document.getElementById("button") as HTMLButtonElement
    val output = document.getElementById("output")

    button.addEventListener("click", {
        val name = input.value
        output?.textContent = "Hello, $name!"
    })
}