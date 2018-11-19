package link.kotlin.scripts.model

/**
 * List of languages names - codes according ISO 639-1
 * https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes
 *
 * Content of this file should be same with
 * https://github.com/KotlinBy/awesome-kotlin/blob/master/src/main/kotlin/link/kotlin/scripts/model/LanguageCodes.kt
 *
 * @author Ibragimov Ruslan
 * @since 0.1
 */
enum class LanguageCodes(val id: String) {
    EN("english"),
    RU("russian"),
    IT("italian"),
    ZH("chinese"),
    HE("hebrew");

    companion object {
        fun contains(language: String) =
                values().map(LanguageCodes::id).contains(language)
    }
}