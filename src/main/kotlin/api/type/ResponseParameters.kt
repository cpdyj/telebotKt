@file:Suppress("SpellCheckingInspection", "unused")

package api.type

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Contains information about why a request was unsuccessful.
 *
 * @param[migrateToChatId] *Optional*. The group has been migrated to a supergroup with the specified identifier. This number may be greater than 32 bits and some programming languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this identifier.
 * @param[retryAfter] *Optional*. In case of exceeding flood control, the number of seconds left to wait before the request can be repeated
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ResponseParameters @JsonCreator constructor(
    @get:JsonProperty("migrate_to_chat_id")
    @JsonProperty("migrate_to_chat_id")
    val migrateToChatId: Long? = null,
    @get:JsonProperty("retry_after")
    @JsonProperty("retry_after")
    val retryAfter: Int? = null
)