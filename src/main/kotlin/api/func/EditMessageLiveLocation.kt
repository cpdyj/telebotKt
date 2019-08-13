@file:Suppress("RemoveExplicitTypeArguments", "DuplicatedCode", "unused", "SpellCheckingInspection")

package api.func

import api.ApiContext
import api.sendRequest
import api.sendRequestAwait
import api.sendRequestCallback
import api.type.InlineKeyboardMarkup
import api.type.Message
import io.vertx.core.Future

/**
 * Use this method to edit live location messages. A location can be edited until its *live_period* expires or editing is explicitly disabled by a call to [stopMessageLiveLocation][stopMessageLiveLocation]. On success, if the edited message was sent by the bot, the edited [Message][Message] is returned, otherwise *True* is returned.
 *
 * @param[chatId] Required if *inline_message_id* is not specified. Unique identifier for the target chat or username of the target channel (in the format `@channelusername`)
 * @param[messageId] Required if *inline_message_id* is not specified. Identifier of the message to edit
 * @param[inlineMessageId] Required if *chat_id* and *message_id* are not specified. Identifier of the inline message
 * @param[latitude] Latitude of new location
 * @param[longitude] Longitude of new location
 * @param[replyMarkup] A JSON-serialized object for a new [inline keyboard](https://core.telegram.org/bots#inline-keyboards-and-on-the-fly-updating).
 */
fun ApiContext.editMessageLiveLocation(
    chatId: String? = null,
    messageId: Int? = null,
    inlineMessageId: String? = null,
    latitude: Double,
    longitude: Double,
    replyMarkup: InlineKeyboardMarkup? = null
): Future<Message?> = sendRequest<Message?>(
    "editMessageLiveLocation",
    listOf(
        Pair("chat_id", chatId),
        Pair("message_id", messageId),
        Pair("inline_message_id", inlineMessageId),
        Pair("latitude", latitude),
        Pair("longitude", longitude),
        Pair("reply_markup", replyMarkup)
    )
)

fun ApiContext.editMessageLiveLocation(
    chatId: String? = null,
    messageId: Int? = null,
    inlineMessageId: String? = null,
    latitude: Double,
    longitude: Double,
    replyMarkup: InlineKeyboardMarkup? = null,
    callback: (result: Message?) -> Unit
): ApiContext = sendRequestCallback<Message?>(
    "editMessageLiveLocation",
    listOf(
        Pair("chat_id", chatId),
        Pair("message_id", messageId),
        Pair("inline_message_id", inlineMessageId),
        Pair("latitude", latitude),
        Pair("longitude", longitude),
        Pair("reply_markup", replyMarkup)
    ),
    callback
)

suspend fun ApiContext.editMessageLiveLocationAwait(
    chatId: String? = null,
    messageId: Int? = null,
    inlineMessageId: String? = null,
    latitude: Double,
    longitude: Double,
    replyMarkup: InlineKeyboardMarkup? = null
): Message? = sendRequestAwait<Message?>(
    "editMessageLiveLocation",
    listOf(
        Pair("chat_id", chatId),
        Pair("message_id", messageId),
        Pair("inline_message_id", inlineMessageId),
        Pair("latitude", latitude),
        Pair("longitude", longitude),
        Pair("reply_markup", replyMarkup)
    )
)