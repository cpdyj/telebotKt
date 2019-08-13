@file:Suppress("RemoveExplicitTypeArguments", "DuplicatedCode", "unused", "SpellCheckingInspection")

package api.func

import api.type.*
import api.*
import io.vertx.core.Future
import io.vertx.core.AsyncResult

/**
 * Use this method to set default chat permissions for all members. The bot must be an administrator in the group or a supergroup for this to work and must have the *can_restrict_members* admin rights. Returns *True* on success.
 *
 * @param[chatId] Unique identifier for the target chat or username of the target supergroup (in the format `@supergroupusername`)
 * @param[permissions] New default chat permissions
 */
fun ApiContext.setChatPermissions(
    chatId: String,
    permissions: ChatPermissions
): Future<Boolean?> = sendRequest<Boolean?>(
    "setChatPermissions",
    listOf(Pair("chat_id", chatId), Pair("permissions", permissions)),
    object : TypeReference<Boolean> {})

fun ApiContext.setChatPermissions(
    chatId: String,
    permissions: ChatPermissions,
    callback: (result: AsyncResult<Boolean?>) -> Unit
): ApiContext = sendRequestCallback<Boolean?>(
    "setChatPermissions",
    listOf(Pair("chat_id", chatId), Pair("permissions", permissions)),
    callback,
    object : TypeReference<Boolean> {})

suspend fun ApiContext.setChatPermissionsAwait(
    chatId: String,
    permissions: ChatPermissions
): Boolean? = sendRequestAwait<Boolean?>(
    "setChatPermissions",
    listOf(Pair("chat_id", chatId), Pair("permissions", permissions)),
    object : TypeReference<Boolean> {})