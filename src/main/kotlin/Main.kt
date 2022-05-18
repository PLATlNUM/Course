import org.bson.Document
import java.io.File
import java.nio.file.Path
import java.nio.file.Paths


val projectDirAbsolutePath = Paths.get("").toAbsolutePath().toString()
val resourcesPath: Path = Paths.get(projectDirAbsolutePath, "/src/main/resources/data.txt")

fun main() {

    mdbCollection.createIndex(Document.parse("{ 'author' : 1, 'title' : 1, 'year' : 1 }"))

    prettyPrintCursor(mdbCollection.find())
    println(words)
    File(resourcesPath.toString()).printWriter().use { out ->
        out.println("|      author      |      title      |      year      |")
        criterion?.forEach {
            out.println("${it.author} | ${it.title} | ${it.year}")
        }
    }
}