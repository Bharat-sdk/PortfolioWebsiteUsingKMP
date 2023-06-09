package com.bharat.kumar.themes

import com.varabyte.kobweb.compose.ui.graphics.Color.Companion.rgb
import org.jetbrains.compose.web.css.CSSColorValue

enum class Color(
    val hex :String,
    val rgb: CSSColorValue
) {
    Primary(hex = "#19142A", rgb =rgb(25,20,42)),
    Secondary(hex = "#D6223B", rgb = rgb(r = 214, g = 34, b = 59)),
    SecondaryVariant(hex = "#2a2344", rgb = rgb(42,35,68)),
    WelcomeTextBackground(hex = "#51182e", rgb = rgb(81,24,46)),
    White(hex = "#FFFFFF", rgb = rgb(255,255,255)),
    GreyTextColor(hex = "#282432", rgb = rgb(137, 132 ,152)),

}
