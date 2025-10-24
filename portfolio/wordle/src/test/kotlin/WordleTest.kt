import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

@Suppress("unused")
class WordleTest : StringSpec({

    "isValid should return true only for 5-letter words"{
        isValid("APPLE") shouldBe true
        isValid("YET") shouldBe false
        isValid("BANANA") shouldBe false
        isValid("") shouldBe false
        isValid("EARTH") shouldBe true
    }

    "readWordList should read words from a file"{
        val tempFile = File.createTempFile("testWords", ".txt")
        tempFile.writeText("APPLE\n BANANA\n HELLO\n DATE\n WORLD\n FIG\n GRAPE")

        val words = readWordList(tempFile.absolutePath)
        words.size shouldBe 7
        words[0] shouldBe "APPLE"
    }

    "pickRandomWord should remove the chosen word from the list"{
        val words = mutableListOf("APPLE", "WORLD", "HELLO")
        val chosen = pickRandomWord(words)
        words.contains(chosen) shouldBe false
    }

    "evaluateGuess should return correct matches"{
        val guess = "HELLO"
        val target = "HEART"
        val result = evaluateGuess(guess, target)
        result shouldBe listOf(2,2,0,0,0)
    }

    "evaluateGuess should detect correct letters in wrong position"{
        val guess = "ALERT"
        val target = "LEAST"
        val result = evaluateGuess(guess, target)
        result shouldBe listOf(1,1,1,0,2)
    }
})
