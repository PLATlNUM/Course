import com.mongodb.client.MongoDatabase
import org.json.JSONObject
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection
import org.litote.kmongo.json

val client = KMongo
    .createClient("mongodb://root:GErSisa8eRS1@192.168.0.117:27017")

val mongoDatabase: MongoDatabase = client.getDatabase("test")

val mdbCollection = mongoDatabase.getCollection<BibtexClassKeys>()

fun prettyPrintJson(json: String) =
    println(
        JSONObject(json)
            .toString(4)
    )

fun prettyPrintCursor(cursor: Iterable<*>) =
    prettyPrintJson("{ result: ${cursor.json} }")