package com.group.project;

import java.io.Serializable;
import java.util.ArrayList;

public class CityDB implements Serializable {

    private ArrayList<CityModel> cityList = new ArrayList<>();

    public CityDB() {
        // HOT COUNTRIES
        // Dominican Republic
        AddCity(new CityModel("Santo Domingo", "Dominican Republic",
                "Santo Domingo, capital of the Dominican Republic. It is situated on the southeast coast of the island of Hispaniola, at the mouth of the Ozama River, and is the oldest permanent city established by Europeans in the Western Hemisphere. The city is also the seat of the oldest Roman Catholic archbishopric in the Americas.", "18.483402", "-69.929611",
                "Cheap", "Bugs",
                "Beach", "https://www.godominicanrepublic.com/santo-domingo/", "city_santodomingo"));
        AddCity(new CityModel("Punta Cana", "Dominican Republic",
                "Best all inclusive hotels, sun-soaked coastal town consisting almost solely of beaches, resorts and tourist amenities. The ultimate beach getaway, Punta Cana was made for vacationers seeking rest and relaxation with a beautiful Caribbean atmosphere and a laid-back attitude.", "18.58182", "-68.40431",
                "Mid", "None",
                "Rural",
                "https://www.godominicanrepublic.com/punta-cana/",
                "city_puntacana"));
        AddCity(new CityModel("La Romana", "Dominican Republic",
                "Very upscale area, La Romana, city and port, southeastern Dominican Republic, on the Caribbean Sea opposite Catalina Island. Founded near the end of the 19th century, La Romana grew rapidly after the establishment of a large sugar mill there in 1911.", "18.42733", "-68.97285",
                "Rich", "Crowds",
                "Urban",
                "https://www.godominicanrepublic.com/la-romana/", "city_laromana"));

        // Jamaica
        AddCity(new CityModel("White House", "Jamaica",
                "Rich luxury spot, from all-new Over-the-Water Bungalows, an overwater bar, and a romantic Over-the-Water Chapel, Sandals South Coast brings guests closer than ever to the water. Set on a 2-mile stretch of Jamaica's south coast's most pristine white-sand beach and nestled within a 500-acre nature preserve, this spectacular seaside oasis features three distinctive European Villages.", "18.0944", "-77.9667",
                "Mid", "Wild Animals",
                "Beach", "https://www.sandals.com/south-coast/", "city_whitehouse"));
        AddCity(new CityModel("Kingston", "Jamaica",
                "Kingston, city, capital, and chief port of Jamaica, sprawling along the southeastern coast of the island, backed by the Blue Mountains. It is famous for its fine natural harbour, which is protected by the Palisadoes, a narrow peninsula that has been developed as a recreational and tourist resort.", "18.0179", "-76.8099", "Mid",
                "Bugs",
                "Urban",
                "https://www.visitjamaica.com/plan-your-trip/explore-the-island/kingston/",
                "city_kingston"));
        AddCity(new CityModel("Montego Bay", "Jamaica",
                "Full of resorts and beaches and is a commercial centre and port  with a large export trade in fruit and other produce. It has an international airport and is noted for its white sand beaches, especially Doctor's Cave on the north shore.", "18.4762", "-77.8939",
                "Rich",
                "Wild Animals",
                "Beach",
                "https://www.visitjamaica.com/plan-your-trip/explore-the-island/montego-bay/",
                "city_montegobay"));

        // Cuba
        AddCity(new CityModel("Old Havana", "Cuba",
                "Good for your first visit to Cuba, it is one of the 15 municipalities in Havana, and contains the core of the original city of Havana. It is known for its bright colors and rich cultural heritage. Old Havana became a UNESCO World Heritage Site in 1982.", "23.1344", "-82.3533",
                "Cheap",
                "Bugs", "Urban", "https://www.tripcuba.org/old-havana",
                "city_oldhavana"));
        AddCity(new CityModel("Santa Clara", "Cuba",
                "Low budget, people place. Living in Santa Clara offers residents an urban suburban mix feel and most residents rent their homes. In Santa Clara there are a lot of restaurants, coffee shops, and parks. Many families and young professionals live in Santa Clara and residents tend to be liberal.", "37.3541", "-121.9552",
                "Cheap",
                "Wild Animals",
                "Rural", "https://www.tripcuba.org/santa-clara-villa-clara", "city_santaclara"));
        AddCity(new CityModel("Centro Habana", "Cuba",
                "Crowded, nightlife area. The municipality is a must visit spot, because it houses some of the most relevant buildings in Havana and due to it's a midpoint between the most tourist areas in the province.", "23.1351", "-82.3696",
                "Mid",
                "Crowds",
                "Urban", "https://www.tripcuba.org/centro-habana", "city_centrohabana"));

        // India
        AddCity(new CityModel("Delhi", "India",
                "New Delhi is best known as the location of India's national government. New Delhi has great historical significance as it was home to powerful people, such as the Pāṇḍavas and the Mughals. The city has many historical monuments and tourist attractions as well as lively marketplaces and great food, such as chaat.", "28.7041", "77.1025",
                "Mid",
                "Crowds",
                "Urban",
                "https://www.delhitourism.gov.in/delhitourism/aboutus/index.jsp", "city_delhi"));
        AddCity(new CityModel("Jaipur", "India",
                " The city is surrounded by hills and dotted with forts. Houses with pink latticed windows line the streets, and look almost magical at sunset.", "26.9124", "75.7873",
                "Rich",
                "Bugs",
                "Urban", "https://www.jaipurtravel.com/", "city_jaipur"));
        AddCity(new CityModel("Agra", "India",
                "Agra is a city in the northern state of Uttar Pradesh, India. The city is famous for being the capital of the Mughal emperors from 1526 to 1658. It is a major tourist destination for its many Mughal-era buildings such as Tāj Mahal, Agra Fort and Fatehpūr Sikrī, all three of which are UNESCO World Heritage Sites.", "27.1767", "78.0081",
                "Cheap",
                "Bugs",
                "Urban", "https://agra.nic.in/tourism/", "city_agra"));

        // Mexico
        AddCity(new CityModel("Cancun", "Mexico",
                "Cancun, best-known for its white sand beaches, near-perfect weather, and bright blue waters, is the Acapulco of Mexico's Gulf Coast. Cancun, best-known for its white sand beaches, near-perfect weather, and bright blue waters, is the Acapulco of Mexico's Gulf Coast.", "21.1619", "-86.8515",
                "Cheap",
                "Bugs",
                "Beach", "https://www.mexicancaribbean.travel/cancun/", "city_cancun"));
        AddCity(new CityModel("Mexico City", "Mexico",
                "It is the capital city of Mexico and one of the most important political, cultural, educational and financial centres in North America. Mexico City is the country's largest city as well as its most important political, cultural, educational and financial center.", "19.4326", "-99.1332",
                "Mid",
                "Crowds",
                "Urban", "https://www.visitmexico.com/en/mexico-city", "city_mexicocity"));
        AddCity(new CityModel("San Cristóbal De Las Casas", "Mexico",
                "San Cristobal Island is composed of three or four fused volcanoes, all extinct. It is home to the oldest permanent settlement of the islands and is the island where Darwin first went ashore in 1835. A small lake called El Junco is the only source of fresh water in the islands.", "16.7370", "-92.6376",
                "Cheap",
                "Wild Animals",
                "Rural",
                "https://www.visitmexico.com/en/chiapas/san-cristobal-de-las-casas", "city_sancristobal"));

        // WARM COUNTRIES
        // Turkey
        AddCity(new CityModel("Istanbul", "Turkey",
                "Istanbul is a transcontinental city, straddling the Bosphorus strait in northwestern Turkey between the Sea of Marmara and the Black Sea. Founded on the Sarayburnu promontory around 660 BC as Byzantium, the city now known as Istanbul developed to become one of the most significant cities in history.", "41.0082", "28.9784",
                "Cheap", "None",
                "Urban", "https://visit.istanbul/en/", "city_istanbul"));
        AddCity(new CityModel("Izmir", "Turkey",
                "Izmir is a metropolitan city in the western extremity of Turkey and the third most populous city in Turkey, after Istanbul and Izmir. Once the ancient city of Smyrna, İzmir is now a modern, developed, and busy commercial center, set around a huge bay and surrounded by mountains.", "38.4237", "27.1428",
                "Cheap", "None",
                "Beach", "https://www.visitizmir.org/en", "city_izmir"));
        AddCity(new CityModel("Çanakkale", "Turkey",
                "It is home to unique local seafood dishes, small batch wines, and relaxing beaches. Çanakkale is a dream destination for anyone interested in history, but even if you're not the world's biggest history buff, you still can't go wrong with a trip to Çanakkale.", "40.1467", "26.4086",
                "Cheap", "None",
                "Urban",
                "https://turkeytravelplanner.com/go/ThraceMarmara/canakkale/index.html",
                "city_canakkale"));

        // France
        AddCity(new CityModel("Paris", "France",
                "It houses the largest mosaic in France and boasts an incredible panoramic view over the city from the top of the Montmartre district! Paris is also a city of iconic squares, including the Place de la Concorde with its two fountains, rostral columns and the incredible Luxor Obelisk, the Place de la Bastille.", "48.8566", "2.3522",
                "Mid", "None",
                "Urban", "https://www.visitparisregion.com/en", "city_paris"));
        AddCity(new CityModel("Nice", "France",
                "Nice, France is known for its beautiful location on the French Riviera. The French culture and Mediterranean climate have made Nice a popular tourist destination for hundreds of years. The city is also famous for its yearly festival and parades, the Carnival de Nice.", "43.7102", "7.2620",
                "Cheap", "None",
                "Beach", "http://www.nice-tourism.com/en/", "city_nice"));
        AddCity(new CityModel("Lyon", "France",
                "The city is known for its historical and architectural landmarks and is a UNESCO World Heritage Site. Lyon was historically known as an important area for the production and weaving of silk and in modern times has developed a reputation as the capital of gastronomy in France.", "45.7640", "4.8357",
                "Cheap", "None",
                "Urban", "https://en.lyon-france.com/", "city_lyon"));

        // Italy
        AddCity(new CityModel("Rome", "Italy",
                "Rome is famous for the Colosseum, the Roman Forum, and a sprawling metropolis of Classical architecture. But the city is known for more than its ancient history: it is home to the Spanish Steps, the Trevi Fountain, incredible food, gardens and art, and a world-famous film industry.", "41.9028", "12.4964",
                "Mid", "Crowds",
                "Urban", "https://romesite.com/", "city_rome"));
        AddCity(new CityModel("Venice", "Italy",
                "Venice, known also as the “City of Canals,” “The Floating City,” and “Serenissima,” is arguably one of Italy's most picturesque cities. With its winding canals, striking architecture, and beautiful bridges, Venice is a popular destination for travel.", "45.4408", "12.3155",
                "Mid", "Crowds",
                "Beach", "https://www.veneziaunica.it/en/content/visit-venice-0",
                "city_venice"));
        AddCity(new CityModel("Florence", "Italy",
                "The city is noted for its culture, Renaissance art and architecture and monuments. The city also contains numerous museums and art galleries, such as the Uffizi Gallery and the Palazzo Pitti, and still exerts an influence in the fields of art, culture and politics.", "43.7696", "11.2558",
                "Cheap", "Crowds",
                "Urban", "https://www.visitflorence.com/", "city_florence"));

        // Portugal
        AddCity(new CityModel("Lisbon", "Portugal",
                "What was Lisbon known for?\n" +
                        "Image result for lisbon description\n" +
                        "Lisbon is famous for its sunny weather, great nightlife, colorful buildings, Fado music, and friendly locals. It's also home to famous landmarks like the Belem Tower and Jerónimos Monastery. As for food, Lisbon is famous for its seafood and Pastéis de Belém, a type of custard tart.", "38.7223", "-9.1393",
                "Cheap", "Crowds",
                "Urban", "https://lisbonlisboaportugal.com/index.html", "city_lisbon"));
        AddCity(new CityModel("Porto", "Portugal",
                "One of the oldest cities in Europe, its maze of steep and narrow cobbled streets is home to beautiful plazas, churches and houses with colourfully tiled façades. Outside the historic heart, the city has witnessed a renaissance, its seaside suburbs increasingly home to world-class contemporary architecture and cuisine", "41.1579", "-8.6291",
                "Cheap", "None",
                "Beach", "https://www.introducingporto.com/", "city_porto"));
        AddCity(new CityModel("Albufeira", "Portugal",
                "The area is very lively, with live music and entertainment on the streets during the summer. There is a very relaxed atmosphere in the old town. The old town is a great place to just walk around. It is easy to spend a couple of hours walking through the historic centre of Albufeira.", "37.0891", "-8.2479",
                "Cheap", "Bugs",
                "Beach", "https://albufeira.com/", "city_albufeira"));

        // England
        AddCity(new CityModel("London", "England",
                "A Plethora of Historic Sites. From the Tower of London to Westminster Abbey, London is home to some of the United Kingdom's most important historical landmarks. Not only that, many of Londons landmarks are recognizable around the entire globe. Such as Big Ben, the Tower Bridge and of course, the Houses of Parliament.", "51.5072", "-0.1276",
                "Mid", "Crowds",
                "Urban", "https://www.visitlondon.com/", "city_london"));
        AddCity(new CityModel("Oxford", "England",
                "Oxford is known as the “City of Spires” because of its beautiful skyline of Gothic towers and steeples. Most of these belong to the university, which is the oldest in England. The University of Oxford's buildings were mostly built in the 15th, 16th, and 17th centuries.", "51.7520", "-1.2577",
                "Cheap", "Crowds",
                "Urban", "https://www.tourismoxford.ca/", "city_oxford"));
        AddCity(new CityModel("Canterbury", "England",
                "Canterbury has been a European pilgrimage site of major importance for over 800 years since the assassination of Archbishop Thomas Becket in 1170. Today it is one of the most beautiful and historic cities in England.", "51.2802", "1.0789",
                "Mid", "None",
                "Rural", "https://www.canterbury.co.uk/", "city_canterbury"));

        // COLD COUNTRIES
        // Canada
        AddCity(new CityModel("Toronto", "Canada",
                "Toronto is known for its multiculturalism, sports, and unique landmarks, such as the CN Tower. This bustling city features various cuisines, architectural mixtures, and a long history. Toronto is also home to one of the world's largest film festivals, the Toronto International Film Festival.", "43.6532", "-79.3832",
                "Mid", "None",
                "Urban", "https://www.destinationtoronto.com/", "city_toronto"));
        AddCity(new CityModel("Ottawa", "Canada",
                "Ottawa is remarkably clean and green, with large trees, parks and beaches along the three major rivers and historic canal that define the City and region. As well, the Gatineau hills are visible just across the Ottawa River, offering a protected natural setting for many family-oriented recreational activities.", "45.4215", "-75.6972",
                "Mid", "None",
                "Urban", "https://ottawatourism.ca/en", "city_ottawa"));
        AddCity(new CityModel("Quebec City", "Canada",
                "The only fortified city north of Mexico and the birthplace of French Canada, the historic district of Old Québec was declared a UNESCO world heritage site in 1985. Known for the world-famous Château Frontenac, Québec City is also known for its rich history, cobblestone streets, European architecture and fortifications.", "46.8139", "-71.2080",
                "Cheap", "None",
                "Urban", "https://www.quebec-cite.com/en", "city_quebeccity"));

        // Norway
        AddCity(new CityModel("Oslo", "Norway",
                "Oslo is famous for its Viking and nautical history, museums, and impeccable seafood. It's an eco-conscious harbor city with 693,494 inhabitants, and is known by locals as “The Tiger City”. Oslo is also known for its eclectic architecture and for being the home of the Nobel Peace Prize.", "59.9139", "10.7522",
                "Mid", "None",
                "Urban", "https://www.visitoslo.com/en/", "city_oslo"));
        AddCity(new CityModel("Bergen", "Norway",
                "Bergen is famous for its university, which in turn is famous for its world-renowned museum collections. Well worth spending a day at, the University Museum of Bergen (Universitetsmuseet i Bergen) includes the Natural History Collection, the Cultural History Collection, and the Seafaring Museum.", "60.3913", "5.3221",
                "Cheap", "None",
                "Beach", "https://en.visitbergen.com/", "city_bergen"));
        AddCity(new CityModel("Ålesund", "Norway",
                "Famous for its magnificently preserved Art Nouveau architecture, the city of Ålesund is one of Norway's most popular tourist destinations", "62.4722", "-6.1495",
                "Cheap", "None",
                "Urban",
                "https://www.fjordtours.com/places-to-visit-in-norway/alesund/", "city_alesund"));

        // Iceland
        AddCity(new CityModel("Reykjavík", "Iceland",
                "Iceland's capital is famous for its unique architecture, wild nightlife, strange museums, smelly traditional cuisine, and a few hidden attractions as well. There are many quirky, unique, unusual, and secret spots to discover in Reykjavik!", "64.9631", "-19.0208",
                "Rich", "None",
                "Urban", "https://www.visiticeland.com/article/reykjavik/", "city_reykjavik"));
        AddCity(new CityModel("Hafnarfjörður", "Iceland",
                "Hafnarfjörður is known for its creative arts and cultural scene. If what you seek is interesting museums and history, charming art galleries, old fascinating architecture or a great variety of festivals and events, Hafnarfjörður.", "64.0291", "-21.9685",
                "Mid", "None",
                "Rural", "https://visitreykjavik.is/city-areas/hafnarfjordur",
                "city_hafnarfjordur"));
        AddCity(new CityModel("Akureyri", "Iceland",
                "Akureyri is the gateway to the north's spectacular beauty, most notably the Myvatn region, Dettifoss waterfall, Godafoss waterfall, and Asbyrgi canyon, which can all be visited on day trips from Akureyri.", "65.6826", "-18.0907",
                "Mid", "None",
                "Rural", "https://www.visitakureyri.is/en", "city_akureyri"));

        // Switzerland
        AddCity(new CityModel("Zurich", "Switzerland",
                "Zurich is an upmarket banking city and the financial capital of Switzerland. It, therefore, comes as no surprise that it's often labelled as the most expensive city in the world. Zurich is famous for luxurious lifestyles, high-end shopping, and fancy chocolates.", "47.3769", "8.5417",
                "Mid", "Crowds",
                "Urban", "https://www.zuerich.com/en", "city_zurich"));
        AddCity(new CityModel("Geneva", "Switzerland",
                "Geneva is a global city, a financial centre, and a worldwide centre for diplomacy due to the presence of numerous international organizations, including the headquarters of many agencies of the United Nations and the Red Cross. Geneva hosts the highest number of international organizations in the world.", "46.2044", "6.1432",
                "Mid", "Crowds",
                "Urban", "http://www.geneva.info/sights/", "city_geneva"));
        AddCity(new CityModel("Bern", "Switzerland",
                "Bern is known as the city of fountains. Around its historic centre are dozens of them, some are beautiful while others are just down right bizarre (such as the child-eating ogre). Many date back over 500 years.", "46.9480", "7.4474",
                "Mid", "None",
                "Rural", "https://www.bern.com/en/home", "city_bern"));

        // China
        AddCity(new CityModel("Mohe City", "China",
                "Its literal translation means Deser River. It is a county-level city in Daxing'anling Prefecture, Heilongjiang province. It is the northernmost city in China.", "52.9721", "122.5386",
                "Cheap", "Wild Animals",
                "Rural", "https://www.chinatravel.com/mohe", "city_mohe"));
        AddCity(new CityModel("Harbin", "China",
                "Harbin is famous for its frozen winters, ice and snow sculptures, ski resorts, and exotic architecture. Every year from late December to February, the Harbin International Ice and Snow Festival turn many parts of the city into a wonderland of snow.", "45.7567", "126.6424",
                "Cheap", "Crowds",
                "Urban", "http://www.harbin.gov.cn/col/col16590/index.html", "city_harbin"));
        AddCity(new CityModel("Yunnan", "China",
                "Yunnan is known for its ethnic diversity. It is home to 25 of the official 55 ethnic minorities of China. It has the highest concentration of Chinese ethnic minorities and over sixty languages and dialects. If you want to experience China's minority cultures, Yunnan is a must-see destination.", "25.0453", "102.7097",
                "Cheap", "Bugs",
                "Rural", "https://ancientyunnan.com/", "city_yunnan"));
    }

    public boolean AddCity(CityModel city) {
        if (cityList.contains(city))
            return false;
        else {
            cityList.add(city);
            return true;
        }
    }

    public CityModel GetCity(String name) {
        for (int i = 0; i < cityList.size(); i++) {
            if (cityList.get(i).getName().equals(name)) {
                return cityList.get(i);
            }
        }
        // If no results
        return null;
    }

    public CityModel[] GetAllCities() {
        return cityList.toArray(new CityModel[cityList.size()]);
    }

    public boolean RemoveCity(CityModel city) {
        if (cityList.contains(city)) {
            cityList.remove(city);
            return true;
        } else
            return false;
    }
}
