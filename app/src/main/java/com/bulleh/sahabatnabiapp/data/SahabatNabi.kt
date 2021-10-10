package com.bulleh.sahabatnabiapp.data

import com.bulleh.sahabatnabiapp.R

object SahabatNabi {
    private val names = arrayOf(
        "Abu Bakar As-Siddiq",
        "Umar bin Khattab",
        "Utsman bin Affan",
        "Ali bin Abi Thalib",
        "Talhab bin Ubaidillah",
        "Zubair bin Awwam",
        "Abdurrahman bin Auf",
        "Sa'ad bin Abi Waqash",
        "Sa'id bin Zaid",
        "Abu Ubaidah bin Al-Jarrah"
    )

    private val history = arrayOf(
        "Abdullah bin Abu Quhafah (bahasa Arab: عبد الله بن أبي قحافة\u200E; 573 – 23 Agustus 634/21 Jumadil Akhir 13 H) atau yang lebih dikenal dengan Abu Bakar Ash-Shiddiq (bahasa Arab: أبو بكر الصديق\u200E), adalah salah satu pemeluk Islam awal, salah satu sahabat utama Nabi, dan khalifah pertama yang dibaiat sepeninggal Nabi Muhammad wafat. Melalui putrinya, 'Aisyah, Abu Bakar merupakan ayah mertua Nabi Muhammad. Ash-Shiddiq yang merupakan julukan Nabi Muhammad kepada Abu Bakar merupakan salah satu gelar yang paling melekat padanya.[butuh rujukan] Bersama ketiga penerusnya, Abu Bakar dimasukkan ke dalam kelompok Khulafaur Rasyidin.[butuh rujuka",
        "'Umar bin Khattab (bahasa Arab: عمر بن الخطاب\u200E; sekitar 584  – 3 November 644) adalah khalifah kedua yang berkuasa pada tahun 634 sampai 644. Dia juga digolongkan sebagai salah satu Khulafaur Rasyidin. 'Umar merupakan salah satu sahabat utama Nabi Muhammad dan juga merupakan ayah dari Hafshah, istri Nabi Muhammad.",
        "'Utsman bin Affan (bahasa Arab: عثمان بن عفان\u200E, 579 – 17 Juni 656 M/12 Dzulhijjah 35 H)[5] adalah khalifah ketiga yang berkuasa pada tahun 644 sampai 656 dan merupakan Khulafaur Rasyidin dengan masa kekuasaan terlama. Sama seperti dua pendahulunya, 'Utsman termasuk salah satu sahabat utama Nabi Muhammad. Pernikahannya berturut-turut dengan dua putri Nabi Muhammad dan Khadijah membuatnya mendapat julukan Dzun Nurrain (pemilik dua cahaya).",
        "‘Alī bin Abī Thālib (Arab: علي بن أﺑﻲ طالب, Persia: علی پسر ابو طالب) (lahir sekitar 13 Rajab 23 SH/599 Masehi – wafat 21 Ramadan 40 Hijriah/661 Masehi) adalah khalifah keempat yang berkuasa pada tahun 656 sampai 661. Dia termasuk golongan pemeluk Islam pertama dan salah satu sahabat utama Nabi. Secara silsilah, 'Ali adalah sepupu dari Nabi Muhammad. Pernikahan 'Ali dengan Fatimah az-Zahra juga menjadikannya sebagai menantu Nabi Muhammad.",
        "Thalhah bin Ubaidillah (Bahasa Arab طلحة بن عبيد الله) (wafat 36 H/ 656 M) adalah seorang sahabat nabi berasal dari Quraisy, nama lengkapnya adalah Thalhah bin Ubaidillah bin Usman bin Kaab bin Said. Thalhah juga termasuk enam konsultan Nabi Muhammad dan sepuluh orang yang dijanjikan masuk surga. [1]",
        "Az-Zubair bin Al-‘Awwam[1] (bahasa Arab: الزبير بن العوام\u200E) (wafat 36 H/656 M) adalah putra bibi Muhammad, yaitu Shafiyyah binti Abdul Muthalib, salah satu sahabat nabi dan termasuk as-Sabiqun al-Awwalun, yaitu salah seorang dari 10 orang yang pertama masuk Islam. Az-Zubair bin Al-'Awwam juga termasuk salah satu dari 10 sahabat yang di jamin masuk surga.",
        "Abdurrahman bin Auf (bahasa Arab: عبد الرحمن بن عوف, lahir 10 tahun setelah Tahun Gajah – meninggal 652 pada umur 72 tahun) adalah salah seorang dari sahabat Nabi Muhammad yang terkenal. Ia adalah salah seorang dari delapan orang pertama (As-Sabiqunal Awwalun) yang menerima agama Islam, yaitu dua hari setelah Abu Bakar.",
        "Sa'ad bin Abi Waqqas (bahasa Arab: سعد بن أبي وقاص\u200E), juga dikenal sebagai Sa'ad bin Malik,[1] adalah salah satu dari sahabat Nabi Muhammad. Sa'ad dikatakan menjadi orang ketujuh[1] yang memeluk Islam, yang ia lakukan di usia tujuh belas tahun. Sa'ad terutama dikenal karena kepemimpinannya dalam Pertempuran Al-Qadisiyyah dan kunjungannya ke Tiongkok pada tahun 651.",
        "Said bin Zaid adalah seorang yang pertama-tama memeluk Islam. Ia memeluk Islam sebelum Nabi berdakwah di rumah al-Arqam bin Abi al-Aqram. Ia turut serta dalam semua peperangan Rasulullah. Bahkan ia turut ambil bagian juga dalam Perang Yarmuk dan pengepungan Damaskus.",
        "bu Ubaidah bin al-Jarrah adalah Muhajirin dari kaum Quraisy Mekkah yang termasuk paling awal untuk memeluk agama Islam. Ia ikut berhijrah ke Habasyah (saat ini Ethiopia) dan kemudian, Ia hijrah ke Madinah. Ia mengikuti setiap pertempuran dalam membela Islam. Setelah wafatnya Nabi Muhammad, Ia merupakan salah satu calon Khalifah bersama dengan Abu Bakar dan Umar bin Khattab."

    )


    private val image = intArrayOf(
        R.drawable.abu_bakar,
        R.drawable.umar,
        R.drawable.usman,
        R.drawable.ali,
        R.drawable.talhab,
        R.drawable.zubair,
        R.drawable.abdurrahman,
        R.drawable.saad,
        R.drawable.ubaidah,
    )


    val listData: ArrayList<Sahabat>
        get() {
            val list = arrayListOf<Sahabat>()
            for (position in names.indices) {
                val sahabat = Sahabat()
                sahabat.nama = names[position]
                sahabat.history = history[position]
                sahabat.image = image[position]
                list.add(sahabat)
            }
            return list
        }
}