@file:OptIn(ExperimentalComposeWebApi::class)

package com.bharat.kumar.landingSections

import androidx.compose.runtime.*
import com.bharat.kumar.landingSections.styles.FrontCardStyle
import com.bharat.kumar.landingSections.styles.FrontCardTextStyle
import com.bharat.kumar.themes.Color
import com.bharat.kumar.utils.Fonts.HELVETICA
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.dom.ref
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.layout.Divider
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutMeSection() {
    val breakPoint by rememberBreakpoint()
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(leftRight = 50.px, topBottom = 50.px),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        AboutMeText()
        AboutMeImage()
        SocialLinksBar()
    }
}

@Composable
fun AboutMeText() {
    var welcomeText by remember { mutableStateOf("Welcome I'M") }
    Column(
        modifier = Modifier.fillMaxWidth(35.percent)
    ){
        Box(modifier = FrontCardStyle.toModifier()) {
            SpanText(
                modifier = FrontCardTextStyle.toModifier()
                    .padding(10.px)
                    .backgroundColor(Color.WelcomeTextBackground.rgb)
                    .color(Color.White.rgb)
                    .margin(0.px)
                    .borderRadius(6.px)
                    .onMouseEnter {
                         welcomeText = "Namaste I'M"
                    }.onMouseLeave {
                        welcomeText = "Welcome I'M"
                    }
                ,
                text = welcomeText
            )
        }

        P (
            attrs = Modifier
                .fontSize(46.px)
                .margin(topBottom = 10.px)
                .fontFamily("Playfair Display")
                .fontWeight(FontWeight.Light)
                .color(Color.White.rgb)
                .toAttrs()
        ){
            Text("P N Bharat Kumar")
        }

        P (
            attrs = Modifier
                .fontSize(18.px)
                .margin(topBottom = 10.px)
                .color(Color.White.rgb)
                .toAttrs()
        ){
            Text("Android App Developer")
        }

        P (
            attrs = Modifier
                .fontSize(16.px)
                .lineHeight(28.px)
                .color(Color.White.rgb)
                .toAttrs()
        ){
            Text("I am an experienced Android Developer with expertise in Kotlin, Jetpack Architecture components, Clean Architecture with MVVM, Compose UI, SOLID Principles, and Agile methodologies. I also teach people Android App Development and help them to grow as a better developer.\n")
        }

    }
}

@Composable
fun SocialLinksBar() {
    var heightOfText by remember { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            ref = ref{
              heightOfText  = it.offsetWidth
            }
        ) {
            SpanText(
                text = "FOLLOW ME ON : ",
                modifier = Modifier
                    .rotate(90.deg)
                    .margin(top = heightOfText.px/2)
                    .color(Color.Secondary.rgb)
                    .fontFamily(HELVETICA)
                    .fontWeight(FontWeight.SemiBold)
            )
        }

        Divider(
            modifier = Modifier
                .height(40.px)
                .margin(top = heightOfText.px/2, bottom = 20.px)
                .backgroundColor(Color.White.rgb)
                .borderColor(Color.Secondary.rgb)
                .width(2.px)

        )

        FaLinkedinIn(
            modifier = Modifier.color(Color.Secondary.rgb).margin(bottom = 20.px),
            size = IconSize.XL
        )
        FaGithubAlt(
            modifier = Modifier.color(Color.Secondary.rgb).margin(topBottom = 20.px),
            size = IconSize.XL
        )
        FaInstagram(
            modifier = Modifier.color(Color.Secondary.rgb).margin(topBottom = 20.px),
            size = IconSize.XL
        )
    }
}

@Composable
fun AboutMeImage() {
    Image(
        modifier = Modifier.fillMaxHeight().fillMaxWidth(55.percent),
        src = "myImage_test.png"
    )
}


