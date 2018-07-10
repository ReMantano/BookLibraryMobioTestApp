package com.example.booklibrarymobiotestapp.book;



import com.example.booklibrarymobiotestapp.R;

import java.util.ArrayList;

/**
 * Created by Vladislav on 09.07.2018.
 */

public class Tales  {

    private ArrayList<ListBook> list;

    public ArrayList<ListBook> getArray(){
        return  list;
    }

    public void initilalizedData(){

        list = new ArrayList<ListBook>();

        list.add(new ListBook(
                "Дж. К. Роулинг ",
                "Сказки барда Бидля",
                R.drawable.bidla,
                "Это специальное издание Сказок барда Бидля, знакомых всем колдунам и ведьмам с детства. Перевод с" +
                        " рунического сделан Гермионой Грейнджер. Автор комментариев и пояснений - самый знаменитый колдун" +
                        " современности, профессор Альбрус Персиваль Вульфрик Брайан Думбльдор. Для среднего школьного возраста."

        ));

        list.add(new ListBook(
                "Антуан де Сент-Экзюпери",
                "Маленький принц",
                R.drawable.small,
                "Есть произведения, которые следует перечитывать по мере взросления. Их немного, потому что непросто " +
                        "создать нечто одинаково интересное для детей и родителей. Есть произведения, которые обязательно нужно" +
                        " прочитать в юные годы, когда закладываются ценностные ориентиры и жизненные принципы. Этих книг –" +
                        " великое множество, но «Маленький принц» занимает особое место. Свою самую известную сказку Антуан де " +
                        "Сент-Экзюпери написал в 42 года. Зрелая личность, человек несколько раз попадавший в авиакатастрофы, " +
                        "потерявший всех своих друзей, он как-то заметит: «На свете у меня не осталось никого, кому можно было " +
                        "бы сказать: „А помнишь?“ Совершенная пустыня». «Маленький принц» – это философская сказка, а " +
                        "соответственно каждый её понимает по-своему. С уверенностью можно сказать лишь одно: она о том, " +
                        "«чего глазами не увидишь». "

        ));
        list.add(new ListBook(
                "Алан Милн ",
                "Винни Пух - Дом на Пуховой опушке",
                R.drawable.house,
                "Если ты уже знаком с Винни-Пухом, если видел мультфильмы, где он поет свои Шумелки, тебе будет приятно " +
                        "вновь встретиться с этим славным медвежонком. А если ты ничего не знаешь ни об этом знаменитом" +
                        " медвежонке, ни о его друзьях - тебе предстоит очень приятное знакомство! В пересказе Бориса Заходера." +
                        " Для дошкольного и младшего школьного возраста."

        ));
        list.add(new ListBook(
                "Льюис Кэрролл ",
                "Алиса в стране чудес",
                R.drawable.wondefull,
                "Алиса в стране чудес - это дверца в необыкновенную страну человеческого воображения. Фантазия читателя - " +
                        "вот ключик от этой дверцы. Сказка Льюиса Кэрролла открывает огромный простор воображению каждого" +
                        " читателя, а уж если этот читатель художник… Если посмотреть на разные издания Алисы, можно увидеть: " +
                        "сколько иллюстраторов, столько и ключиков к заветной дверце. Такое сравнение оказалось делом весьма " +
                        "увлекательным. Так и появился альбом с работами самых разных художников: от собственно рисунков Льюиса" +
                        " Кэрролла и первого профессионального иллюстратора Джона Тенниела до самого большого выдумщика XX века " +
                        "- Сальвадора Дали, для которого парадоксальный мир Алисы оказался созвучным его собственным " +
                        "сюрреалистическим видениям."

        ));
        list.add(new ListBook(
                "Александр Волков ",
                "Волшебник Изумрудного города",
                R.drawable.wizard,
                "Девочка Элли из Канзаса и её верный пёсик Тотошка попадают в Волшебную страну. Ураган, вызванный " +
                        "злой волшебницей Гингемой, перенёс домик-фургон с Элли и Тотошкой через непроходимые пустыню и горы." +
                        " Добрая волшебница Виллина направила фургон так, что он приземлился прямо на голову Гингемы и " +
                        "раздавил её. Виллина сообщает Элли, что вернуть её в Канзас может великий волшебник Гудвин, который " +
                        "живёт в Изумрудном Городе. Чтобы вернуться домой, Элли должна помочь трём существам в исполнении их" +
                        " заветных желаний. "

        ));
        list.add(new ListBook(
                "Александр Пушкин ",
                "Сказка о царе Салтане",
                R.drawable.tails,
                "Сказка о царе Салтане, о сыне его славном и могучем богатыре Гвидоне Салтановиче и о прекрасной царевне " +
                        "Лебеди была написана Александром Сергеевичем Пушкиным в 1831 году, на основе народной сказки." +
                        " Ее удивительный, волшебный мир, захватывающий сюжет и чудесные персонажи вдохновили знаменитого " +
                        "художника Ивана Яковлевича Билибина на создание великолепных иллюстраций, украшающих эту книгу."

        ));
        list.add(new ListBook(
                "Алан Милн ",
                "Винни-Пух и все-все-все",
                R.drawable.vinny,
                "Винни-Пух — плюшевый мишка, персонаж повестей и стихов Алана Александра Милна. Один из самых известных " +
                        "героев детской литературы XX века. В 1960—1970-е годы, благодаря переводу Бориса Заходера «Винни-Пух " +
                        "и все-все-все», а затем и фильмам студии «Союзмультфильм», где мишку озвучивал Евгений Леонов, Винни-Пух " +
                        "стал очень популярен и в Советском Союзе."

        ));
        list.add(null);
        list.add(new ListBook(
                "Николай Носов ",
                "Незнайка на Луне",
                R.drawable.moon,
                "Эти книги в стиле ретро вызывают ностальгию. Их оформление максимально приближено к старым добрым и " +
                        "любимым книгам детства, которые по праву занимали самое почетное место на книжной полке. Для всех" +
                        " почитателей творчества Носова. Для тех родителей, которые хотят познакомить детей с первыми " +
                        "приключенческими детскими романами в СССР. Незнайка, ставший столь популярным, что его имя не сходило " +
                        "с экранов телевизоров, которого помещали на фантики конфет, включали в клуб весёлых человечков" +
                        " в журнале Веселые картинки, был одним из первых детских литературных персонажей, который побывал на Луне. "

        ));
        list.add(new ListBook(
                "Николай Носов ",
                "Приключения Незнайки и его друзей",
                R.drawable.friend,
                "«Приключения Незнайки и его друзей» – это первая книга увлекательной трилогии замечательного русского " +
                        "писателя Николая Носова, посвященной жизни необычайных крошечных человечков-коротышек и предпринятым ими" +
                        " невероятным путешествиям.Веселая, размеренная и беззаботная жизнь Цветочного города, периодически " +
                        "наполняется хаосом из-за скандальных выходок неутомимого малыша-коротыша по имени Незнайка. Сидеть на " +
                        "месте у Незнайки просто не получается, а трудиться с пользой для дела этот глупенький малыш не обучен." +
                        " То ему придет в голову взбудоражить соседей рассказами о приближающейся катастрофе, то – написать " +
                        "стишки собственного сочинения, похожие на дразнилки, то – проехаться с ветерком на знаменитом автомобиле" +
                        " с сиропом и нечаянно уничтожить это уникальное изобретение Винтика и Шпунтика.Но самое интересное для" +
                        " Незнайки и его товарищей-коротышек начинается тогда, когда они приняли решение построить воздушный шар " +
                        "и отправиться на нем в дальние страны."

        ));
        list.add(new ListBook(
                "Льюис Кэрролл ",
                "Алиса в Зазеркалье",
                R.drawable.alice,
                "Сказки замечательного английского писателя, математика и философа Льюиса Кэрролла о приключениях Алисы " +
                        "в Стране чудес и в Зазеркалье можно назвать, пожалуй, самыми известными в мировой литературе. " +
                        "Их перевели почти на сто языков, по ним рисуют мультфильмы, сочиняют мюзиклы и оперы, создают" +
                        " компьютерные игры, снимают кино. Эти сказочные истории, придуманные полтора века назад, до сих" +
                        " пор остаются самыми оригинальными, необычными и мудрыми, в них так много веселых бессмыслиц, которые" +
                        " рождают серьезные мысли, что и дети, и взрослые вслед за героями то и дело повторяют: Едят ли кошки моше" +
                        "к, едят ли мошки кошек?, Все страньше и страньше. Что толку в книжке, если в ней нет ни картинок, " +
                        "ни разговоров?, Я получил классическое образование - мы целый день играли в классики...В книгу вошли" +
                        " всемирно известные сказочные повести английского писателя, математика и философа Льюиса Кэрролла " +
                         "Приключения Алисы в Стране чудес и Алиса в Зазеркалье. Обе сказки представлены в переводе Н.М.Демуровой" +
                            ", который уже более полувека считается одним из лучших и по праву принадлежит к классике мировой литературы."

        ));
        list.add(new ListBook(
                "Оскар Уайльд  ",
                "Счастливый принц",
                R.drawable.happy,
                "Покрытая золотом и драгоценными камнями скульптура Счастливого Принца стояла на колонне над городом. " +
                        "Все восхищались прекрасной статуей. Однажды над городом летел Скворец — он покинул свою возлюбленную" +
                        " Тростинку, которая была домоседкой и не разделяла любви к путешествием, а лишь флиртовала с Ветром; " +
                        "он устроился на ночевку между туфель Принца. Вдруг птица почувствовала на себе слезы Принца —" +
                        " тот плакал, ибо видел всю скорбь и нищету города, хотя и имел оловянное сердце. По просьбе Принца " +
                        "Скворец не улетел в Египет, а несколько дней носил бедным людям помощь в виде драгоценностей со " +
                        "скульптуры: швее, у которой болел сын — рубин со шпаги, бедному юноше-драматургу — глаз-сапфир, " +
                        "девочке, уронившей спички для продажи в канаву — второй сапфир."

        ));
        list.add(new ListBook(
                "Астрид Линдгрен ",
                "Карлсон, который живет на крыше",
                R.drawable.roof,
                "Взрослые часто удивляются: почему детям так нравится Карлсон? Противный, капризный, невоспитанный, " +
                        "вечно требующий вкусной еды... Этот ряд можно продолжать до бесконечности. Может, потому, что каждое" +
                        " мгновение он готов проказничать, и не всегда невинно? Дурное влияние улицы (в данном случае - крыши)" +
                        " всегда привлекательно для домашних детей? Думается, это совсем не так. Ведь Карлсон для Малыша - не " +
                        "отпетый хулиган и заводила в рискованных играх, а скорее одинокий ребенок, который нуждается в ласке," +
                        " участии и семейном тепле. Малыш, несмотря на свой маленький возраст, очень хорошо это чувствует." +
                        " Он жалеет Карлсона и прощает ему многое. Эта великая книга учит ребенка любви и терпимости к тем," +
                        " кого любить трудно."

        ));
        list.add(new ListBook(
                "Астрид Линдгрен ",
                "Пеппи Длинный Чулок",
                R.drawable.longer,
                "Однажды заглянув через забор соседней виллы, Томми и Анника увидели нечто невообразимое: маленькую " +
                        "девочку, которая несла на руках настоящую лошадь. Но разве такое может быть? Представьте, может! " +
                        "Потому что эта девочка - Пеппи Длинный чулок. Никого на свете нет сильнее её. Она способна уложить " +
                        "на лопатки даже самого прославленного силача-тяжеловеса. И вот она поселилась на вилле Вверхтормашками" +
                        "со своей лошадью и маленькой обезьянкой по имени Господин Нильсон.Теперь Томми и Аннике будет с" +
                        " кем поиграть, ведь Пеппи, как известно, удивительная фантазёрка и выдумщица...По книге " +
                        "Пеппи Длинныйчулок Перевод со шведского Л. Ю. Брауде.Рисунки Ингрид Ванг Нюман.Для младшего " +
                        "школьного возраста."

        ));
        list.add(new ListBook(
                "Редьярд Киплинг ",
                "Книга Джунглей",
                R.drawable.book,
                "Редьярд Киплинг — знаменитый писатель, поэт и новеллист, первый англичанин, получивший " +
                        "Нобелевскую премию по литературе. Проза Редьярда Киплинга, насыщенная образным просторечием, " +
                        "грубоватым юмором, романтикой странствий и тонким лиризмом – поразила читателей викторианской " +
                        "Англии. Сочетая точность репортера, фантазию романтика и мудрость философа, Киплинг пишет о" +
                        " вечных проблемах – любви и свободе, войне и мире, противостоянии Востока и Запада. В сборник вошли " +
                        "знаменитые «Книги джунглей» и избранные рассказы."

        ));
        list.add(new ListBook(
                "Николай Носов ",
                "Незнайка в Солнечном городе",
                R.drawable.sun,
                "Уже несколько поколений юных читателей в нашей стране выросло на книгах замечательного писателя" +
                        " Николая Носова. Его романы-сказки о Незнайке – «Приключения Незнайки и его друзей», «Незнайка в " +
                        "Солнечном городе», «Незнайка на Луне» – стали классикой детской литературы. Во второй части " +
                        "трилогии Незнайка становится обладателем волшебной палочки и отправляется вместе с Кнопочкой и" +
                        " Пачкулей Пёстреньким в путешествие. Друзья оказываются в Солнечном городе, где полным-полно всяких " +
                        "сказочных изобретений: вращающиеся дома, автолошадки, спиралеходы, реактивные роликовые труболёты и " +
                        "другие чудо-машины и механизмы. А потом проказник Незнайка превращает трёх ослов из зоопарка в" +
                        " коротышек. Бывшие ослы хулиганят, а в городе начинаются беспорядки…"

        ));
    }

}

