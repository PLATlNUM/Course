import kotlinx.serialization.Serializable

@Serializable
data class BibtexClassKeys(
    val annote: String? = null,
    val author: String? = null,
    val booktitle: String? = null,
    val chapter: String? = null,
    val edition: String? = null,
    val editor: String? = null,
    val howpublished: String? = null,
    val institution: String? = null,
    val journal: String? = null,
    val month: String? = null,
    val note: String? = null,
    val number: String? = null,
    val organization: String? = null,
    val pages: String? = null,
    val publisher: String? = null,
    val school: String? = null,
    val series: String? = null,
    val title: String? = null,
    val type: String? = null,
    val volume: String? = null,
    val year: String? = null
)