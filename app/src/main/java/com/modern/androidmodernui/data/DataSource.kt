package com.modern.androidmodernui.data

import com.modern.androidmodernui.R

object DataSource {

    fun getFirstList(): ArrayList<AppItem> {
        val items = arrayListOf<AppItem>()
        items.add(
            AppItem(
                title = "BookMyShow",
                smallDesc = "Book your movie ticket instantly",
                size = 25,
                image = R.drawable.ic_bookmyshow,
                rating = 4.2f
            )
        )
        items.add(
            AppItem(
                title = "FaceBook",
                smallDesc = "Legacy old social network",
                size = 40,
                image = R.drawable.ic_facebook,
                rating = 4.1f
            )
        )
        items.add(
            AppItem(
                title = "Flipkart",
                smallDesc = "Shop with ease and fun together",
                size = 26,
                image = R.drawable.ic_flipkart,
                rating = 4.5f
            )
        )
        items.add(
            AppItem(
                title = "Instagram",
                smallDesc = "Social network for young adults",
                size = 67,
                image = R.drawable.ic_insta,
                rating = 4.4f
            )
        )
        items.add(
            AppItem(
                title = "Prime Video",
                smallDesc = "India's finest video ott platform",
                size = 23,
                image = R.drawable.ic_prime_video,
                rating = 4.2f
            )
        )
        items.add(
            AppItem(
                title = "Swiggy",
                smallDesc = "Order food instantly from 500+ locations",
                size = 21,
                image = R.drawable.ic_swiggy,
                rating = 4.2f
            )
        )
        items.add(
            AppItem(
                title = "Tinder",
                smallDesc = "Find your partner, friend, husband at one place",
                size = 45,
                image = R.drawable.ic_tinder,
                rating = 3.8f
            )
        )
        items.add(
            AppItem(
                title = "Twitter",
                smallDesc = "Discuss, tweet, share your thoughts with people",
                size = 64,
                image = R.drawable.ic_twitter,
                rating = 4.0f
            )
        )
        items.add(
            AppItem(
                title = "Uber",
                smallDesc = "Book your ride in one click with uber!",
                size = 54,
                image = R.drawable.ic_uber,
                rating = 4.4f
            )
        )
        items.add(
            AppItem(
                title = "Zomato",
                smallDesc = "The ultimate quality food delivery restaurants",
                size = 33,
                image = R.drawable.ic_zomato,
                rating = 4.1f
            )
        )
        items.add(
            AppItem(
                title = "Clock",
                smallDesc = "Time is money, be on time always",
                size = 46,
                image = R.drawable.ic_clock,
                rating = 4.7f
            )
        )
        items.add(
            AppItem(
                title = "Cult",
                smallDesc = "India's most common fitness community",
                size = 60,
                image = R.drawable.ic_cult,
                rating = 3.4f
            )
        )
        items.add(
            AppItem(
                title = "Ganna",
                smallDesc = "Listen to your favourite song without download",
                size = 33,
                image = R.drawable.ic_ganna,
                rating = 4.1f
            )
        )
        items.add(
            AppItem(
                title = "Paytm",
                smallDesc = "Based scan to paytm app",
                size = 20,
                image = R.drawable.ic_paytm,
                rating = 4.8f
            )
        )
        items.add(
            AppItem(
                title = "Pregnancy Tracker",
                smallDesc = "Track and manage your best mom days",
                size = 33,
                image = R.drawable.ic_pregnancy,
                rating = 4.1f
            )
        )
        items.add(
            AppItem(
                title = "Snapchat",
                smallDesc = "Best camera and filter app to share with friends",
                size = 70,
                image = R.drawable.ic_snapchat,
                rating = 4.0f
            )
        )
        items.add(
            AppItem(
                title = "Whatsapp",
                smallDesc = "The most loved messaging app",
                size = 30,
                image = R.drawable.ic_whatsapp,
                rating = 4.9f
            )
        )
        items.add(
            AppItem(
                title = "Zoom",
                smallDesc = "Video calling and conferening app",
                size = 65,
                image = R.drawable.ic_zoom,
                rating = 4.2f
            )
        )
        items.shuffle()
        return items
    }
}