@file:Suppress("SpellCheckingInspection", "unused")

package api.type

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * This object contains basic information about a successful payment.
 *
 * @param[currency] Three-letter ISO 4217 [currency](https://core.telegram.org/bots/payments#supported-currencies) code
 * @param[totalAmount] Total price in the *smallest units* of the currency (integer, **not** float/double). For example, for a price of `US$ 1.45` pass `amount = 145`. See the *exp* parameter in [currencies.json](https://core.telegram.org/bots/payments/currencies.json), it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
 * @param[invoicePayload] Bot specified invoice payload
 * @param[shippingOptionId] *Optional*. Identifier of the shipping option chosen by the user
 * @param[orderInfo] *Optional*. Order info provided by the user
 * @param[telegramPaymentChargeId] Telegram payment identifier
 * @param[providerPaymentChargeId] Provider payment identifier
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
data class SuccessfulPayment @JsonCreator constructor(
    @get:JsonProperty("currency")
    @JsonProperty("currency")
    val currency: String,
    @get:JsonProperty("total_amount")
    @JsonProperty("total_amount")
    val totalAmount: Int,
    @get:JsonProperty("invoice_payload")
    @JsonProperty("invoice_payload")
    val invoicePayload: String,
    @get:JsonProperty("shipping_option_id")
    @JsonProperty("shipping_option_id")
    val shippingOptionId: String? = null,
    @get:JsonProperty("order_info")
    @JsonProperty("order_info")
    val orderInfo: OrderInfo? = null,
    @get:JsonProperty("telegram_payment_charge_id")
    @JsonProperty("telegram_payment_charge_id")
    val telegramPaymentChargeId: String,
    @get:JsonProperty("provider_payment_charge_id")
    @JsonProperty("provider_payment_charge_id")
    val providerPaymentChargeId: String
)