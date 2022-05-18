import com.mongodb.client.FindIterable
import org.litote.kmongo.eq

val words = BibtexClassKeys::class.java.getResource("criterion.txt")!!
    .readText()
    .split(" ", limit = 2)

val criterion: FindIterable<BibtexClassKeys>? =
    mapOf(
        "author" to mdbCollection.find(BibtexClassKeys::author eq words[1].removeSurrounding(" ", " ")),
        "annote" to mdbCollection.find(BibtexClassKeys::annote eq words[1].removeSurrounding(" ", " ")),
        "booktitle" to mdbCollection.find(BibtexClassKeys::booktitle eq words[1].removeSurrounding(" ", " ")),
        "chapter" to mdbCollection.find(BibtexClassKeys::chapter eq words[1].removeSurrounding(" ", " ")),
        "edition" to mdbCollection.find(BibtexClassKeys::edition eq words[1].removeSurrounding(" ", " ")),
        "editor" to mdbCollection.find(BibtexClassKeys::editor eq words[1].removeSurrounding(" ", " ")),
        "howpublished" to mdbCollection.find(BibtexClassKeys::howpublished eq words[1].removeSurrounding(" ", " ")),
        "institution" to mdbCollection.find(BibtexClassKeys::institution eq words[1].removeSurrounding(" ", " ")),
        "journal" to mdbCollection.find(BibtexClassKeys::journal eq words[1].removeSurrounding(" ", " ")),
        "month" to mdbCollection.find(BibtexClassKeys::month eq words[1].removeSurrounding(" ", " ")),
        "note" to mdbCollection.find(BibtexClassKeys::note eq words[1].removeSurrounding(" ", " ")),
        "number" to mdbCollection.find(BibtexClassKeys::number eq words[1].removeSurrounding(" ", " ")),
        "organization" to mdbCollection.find(BibtexClassKeys::organization eq words[1].removeSurrounding(" ", " ")),
        "pages" to mdbCollection.find(BibtexClassKeys::pages eq words[1].removeSurrounding(" ", " ")),
        "publisher" to mdbCollection.find(BibtexClassKeys::publisher eq words[1].removeSurrounding(" ", " ")),
        "school" to mdbCollection.find(BibtexClassKeys::school eq words[1].removeSurrounding(" ", " ")),
        "series" to mdbCollection.find(BibtexClassKeys::series eq words[1].removeSurrounding(" ", " ")),
        "title" to mdbCollection.find(BibtexClassKeys::title eq words[1].removeSurrounding(" ", " ")),
        "type" to mdbCollection.find(BibtexClassKeys::type eq words[1].removeSurrounding(" ", " ")),
        "volume" to mdbCollection.find(BibtexClassKeys::volume eq words[1].removeSurrounding(" ", " ")),
        "year" to mdbCollection.find(BibtexClassKeys::year eq words[1].removeSurrounding(" ", " ")),
    )[words[0]]

