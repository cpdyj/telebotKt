@file:Suppress("RemoveExplicitTypeArguments", "DuplicatedCode", "unused", "SpellCheckingInspection")

package api.func

import api.*
import api.type.Update
import io.vertx.core.Future

/**
 * Use this method to specify a url and receive incoming updates via an outgoing webhook. Whenever there is an update for the bot, we will send an HTTPS POST request to the specified url, containing a JSON-serialized [Update][Update]. In case of an unsuccessful request, we will give up after a reasonable amount of attempts. Returns *True* on success.
 * If you'd like to make sure that the Webhook request comes from Telegram, we recommend using a secret path in the URL, e.g. `https://www.example.com/&lt;token&gt;`. Since nobody else knows your bot‘s token, you can be pretty sure it’s us.
 *
 * @param[url] HTTPS url to send updates to. Use an empty string to remove webhook integration
 * @param[certificate] Upload your public key certificate so that the root certificate in use can be checked. See our [self-signed guide](https://core.telegram.org/bots/self-signed) for details.
 * @param[maxConnections] Maximum allowed number of simultaneous HTTPS connections to the webhook for update delivery, 1-100. Defaults to *40*. Use lower values to limit the load on your bot‘s server, and higher values to increase your bot’s throughput.
 * @param[allowedUpdates] List the types of updates you want your bot to receive. For example, specify [“message”, “edited_channel_post”, “callback_query”] to only receive updates of these types. See [Update][Update] for a complete list of available update types. Specify an empty list to receive all updates regardless of type (default). If not specified, the previous setting will be used.Please note that this parameter doesn't affect updates created before the call to the setWebhook, so unwanted updates may be received for a short period of time.
 */
fun ApiContext.setWebhook(
    url: String,
    certificate: InputFile? = null,
    maxConnections: Int? = null,
    allowedUpdates: List<AllowedUpdate>? = null
): Future<Boolean?> = sendRequest<Boolean?>(
    "setWebhook",
    listOf(
        Pair("url", url),
        Pair("certificate", certificate),
        Pair("max_connections", maxConnections),
        Pair("allowed_updates", allowedUpdates)
    )
)

fun ApiContext.setWebhook(
    url: String,
    certificate: InputFile? = null,
    maxConnections: Int? = null,
    allowedUpdates: List<String>? = null,
    callback: (result: Boolean?) -> Unit
): ApiContext = sendRequestCallback<Boolean?>(
    "setWebhook",
    listOf(
        Pair("url", url),
        Pair("certificate", certificate),
        Pair("max_connections", maxConnections),
        Pair("allowed_updates", allowedUpdates)
    ),
    callback
)

suspend fun ApiContext.setWebhookAwait(
    url: String,
    certificate: InputFile? = null,
    maxConnections: Int? = null,
    allowedUpdates: List<String>? = null
): Boolean? = sendRequestAwait<Boolean?>(
    "setWebhook",
    listOf(
        Pair("url", url),
        Pair("certificate", certificate),
        Pair("max_connections", maxConnections),
        Pair("allowed_updates", allowedUpdates)
    )
)