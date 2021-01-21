package com.example.wikifoods.Adapter

import com.example.wikifoods.R

object FoodData {
    private val foodNames = arrayOf(
        "Bakso",
        "Gado-Gado",
        "Nasi Goreng",
        "Nasi Padang",
        "Pecel",
        "Rawon",
        "Rendang",
        "Sate",
        "Soto",
        "Tahu Telor"
    )

    private val foodImages = intArrayOf(
        R.drawable.img_baksoi,
        R.drawable.img_gadoi,
        R.drawable.img_nasgori,
        R.drawable.img_padangi,
        R.drawable.img_peceli,
        R.drawable.img_rawoni,
        R.drawable.img_rendangi,
        R.drawable.img_satei,
        R.drawable.img_sotoi,
        R.drawable.img_tahutelori
    )

    private val foodRank = arrayOf(
        "3",//bakso
        "3.5",//gado
        "4",//nasgor
        "4.5",//padang
        "3",//pecel
        "4",//rawon
        "5",//rendang
        "5",//sate
        "4",//soto
        "5"
    )

    private val foodDetails = arrayOf(
        "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, akan tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau.",
        "Gado-Gado merupakan salah satu makanan khas yang berasal dari Indonesia yang berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu kacang atau saus dari kacang tanah dan yang dihaluskan disertai irisan telur dan pada umumnya banyak yang menambahkan kentang rebus yang sudah dihaluskan untuk saus gado gado kentang rebus dimasak bersamaan dengan bumbu kacang kemudian di atasnya ditaburi bawang goreng. Sedikit emping goreng atau kerupuk (ada juga yang memakai kerupuk udang) juga ditambahkan.",
        "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin atau mentega, biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk.",
        "Nasi Padang adalah sebuah hidangan yang disajikan secara lengkap secara prasmanan dengan daging, ikan, sayuran, dan makanan pedas dimakan dengan nasi putih, itu adalah komoditas ekspor paling terkenal dan masyarakat minangkabau mempunyai kontribusi yang besar untuk masakan Indonesia.",
        "Pecel merupakan makanan yang terdiri dari sayur yang direbus dan lauk yang dihidangkan dengan alas yang berbeda-beda sesuai kota asal pecel, misalnya piring lidi yang disebut ingke, pincuk, atau tampah bambu. Sayuran yang dihidangkan antara lain kacang panjang, taoge, mentimun, daun singkong, dan daun kemangi. Bumbu sambal kacang yang disiramkan di atas pecel disebut sambal pecel yang terbuat dari campuran kencur, gula merah, garam, cabai, kecombrang, daun jeruk purut, dan kacang tanah sangrai yang dicampur, ditumbuk, atau diulek.",
        "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur (daerah Arekan), dikenal pula oleh masyarakat Jawa Tengah sebelah timur .",
        "Rendang adalah masakan daging yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak.",
        "Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu kemudian dipanggang menggunakan bara arang kayu. Sate disajikan dengan berbagai macam bumbu yang bergantung pada variasi resep sate.[1] Daging yang dijadikan sate antara lain daging ayam, kambing, domba, sapi, babi, kelinci, kuda, dan lain-lain.",
        "Soto adalah makanan khas Indonesia seperti sop yang terbuat dari kaldu daging dan sayuran. Daging yang paling sering digunakan adalah daging sapi dan ayam, tetapi ada pula yang menggunakan daging babi atau kambing.",
        "Tahu Telor adalah salah satu masakan khas kota Lamongan. Tahu tek terdiri atas tahu goreng setengah matang dan lontong yang dipotong kecil-kecil dengan alat gunting dan garpu untuk memegang tahu atau lontong, telur, kentang goreng, sedikit taoge, dan irisan ketimun dipotong kecil-panjang (seperti acar), lalu setelah disiram dengan saus kacang dengan campuran petis di atasnya, ditaburkan kerupuk udang yang bentuknya kecil dengan diameter sekitar 3 cm."
    )


    private val foodSajian = arrayOf(
        "Berkuah",
        "Kering",
        "Kering",
        "Kering",
        "Kering",
        "Berkuah",
        "Kering",
        "Kering",
        "Berkuah",
        "Kering",
    )

    private val foodAsal = arrayOf(
        "Malang",
        "Surabaya",
        "Jakarta",
        "Padang",
        "Madiun",
        "Pasuruan",
        "Minang",
        "Madura",
        "Lamongan",
        "Lamongan"
    )



    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodDetails[position]
                food.photo = foodImages[position]
                food.sajian = foodSajian[position]
                food.asal = foodAsal[position]
                food.rank = foodRank[position]
                list.add(food)
            }
            return list
        }
}