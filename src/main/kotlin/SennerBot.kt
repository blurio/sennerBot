import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.message
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.extensions.filters.Filter

fun main() {

	val bot = bot {

		token = "5389675577:AAHwRWKVyk0_Id5Fm15R1yUJg_y40Sv4N4o"

		dispatch {

			message(Filter.Sticker) {
				println(message.sticker?.emoji)

				if (message.sticker?.emoji == "\uD83D\uDE3A" ) {
					bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "@derSenner")
				}
			}
		}
	}
	bot.startPolling()
}
