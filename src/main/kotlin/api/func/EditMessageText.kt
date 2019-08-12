@file:Suppress("RemoveExplicitTypeArguments", "DuplicatedCode", "unused", "SpellCheckingInspection")

package api.func

import api.*
import api.type.InlineKeyboardMarkup
import api.type.Message
import io.vertx.core.Future

/**
 * Use this method to edit text and [game](https://core.telegram.org#games) messages. On success, if edited message is sent by the bot, the edited [Message][Message] is returned, otherwise *True* is returned.
 *
 * @param[chatId] Required if *inline_message_id* is not specified. Unique identifier for the target chat or username of the target channel (in the format `@channelusername`)
 * @param[messageId] Required if *inline_message_id* is not specified. Identifier of the message to edit
 * @param[inlineMessageId] Required if *chat_id* and *message_id* are not specified. Identifier of the inline message
 * @param[text] New text of the message
 * @param[parseMode] Send [*Markdown*](https://core.telegram.org#markdown-style) or [*HTML*](https://core.telegram.org#html-style), if you want Telegram apps to show [bold, italic, fixed-width text or inline URLs](https://core.telegram.org#formatting-options) in your bot's message.
 * @param[disableWebPagePreview] Disables link previews for links in this message
 * @param[replyMarkup] A JSON-serialized object for an [inline keyboard](https://core.telegram.org/bots#inline-keyboards-and-on-the-fly-updating).
 */
fun ApiContext.editMessageText(
    chatId: String? = null,
    messageId: Int? = null,
    inlineMessageId: String? = null,
    text: String,
    parseMode: ParseMode? = null,
    disableWebPagePreview: Boolean? = null,
    replyMarkup: InlineKeyboardMarkup? = null
): Future<Either<Message, Boolean>?> = sendRequestEither<Message, Boolean>(
    "editMessageText",
    listOf(
        Pair("chat_id", chatId),
        Pair("message_id", messageId),
        Pair("inline_message_id", inlineMessageId),
        Pair("text", text),
        Pair("parse_mode", parseMode),
        Pair("disable_web_page_preview", disableWebPagePreview),
        Pair("reply_markup", replyMarkup)
    )
)

fun ApiContext.editMessageText(
    chatId: String? = null,
    messageId: Int? = null,
    inlineMessageId: String? = null,
    text: String,
    parseMode: ParseMode? = null,
    disableWebPagePreview: Boolean? = null,
    replyMarkup: InlineKeyboardMarkup? = null,
    callback: (result: Either<Message, Boolean>?) -> Unit
): ApiContext = sendRequestEitherCallback<Message, Boolean>(
    "editMessageText",
    listOf(
        Pair("chat_id", chatId),
        Pair("message_id", messageId),
        Pair("inline_message_id", inlineMessageId),
        Pair("text", text),
        Pair("parse_mode", parseMode),
        Pair("disable_web_page_preview", disableWebPagePreview),
        Pair("reply_markup", replyMarkup)
    ),
    callback
)

suspend fun ApiContext.editMessageTextAwait(
    chatId: String? = null,
    messageId: Int? = null,
    inlineMessageId: String? = null,
    text: String,
    parseMode: ParseMode? = null,
    disableWebPagePreview: Boolean? = null,
    replyMarkup: InlineKeyboardMarkup? = null
): Either<Message, Boolean>? = sendRequestEitherAwait<Message, Boolean>(
    "editMessageText",
    listOf(
        Pair("chat_id", chatId),
        Pair("message_id", messageId),
        Pair("inline_message_id", inlineMessageId),
        Pair("text", text),
        Pair("parse_mode", parseMode),
        Pair("disable_web_page_preview", disableWebPagePreview),
        Pair("reply_markup", replyMarkup)
    )
)