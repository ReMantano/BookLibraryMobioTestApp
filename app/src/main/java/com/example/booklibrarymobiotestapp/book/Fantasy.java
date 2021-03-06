package com.example.booklibrarymobiotestapp.book;



import com.example.booklibrarymobiotestapp.R;

import java.util.ArrayList;

/**
 * Created by Vladislav on 09.07.2018.
 */

public class Fantasy  {

    private ArrayList<ListBook> list;

    public ArrayList<ListBook> getArray(){
        return  list;
    }

    public void initilalizedData(){

        list = new ArrayList<ListBook>();

        list.add(new ListBook(
                "Герберт Уэллс",
                "Война миров",
                R.drawable.war,
                "Начало ХХ века, английское графство Сэррей. На Землю один за другим падают большие металлические цилиндры, " +
                        "из которых появляются странные спрутообразные существа. Собрав гигантские шагающие треножники, способные" +
                        " передвигаться со скоростью курьерского поезда и снабженные генераторами смертоносных тепловых лучей и " +
                        "ядовитого черного дыма, чужаки с Марса начинают планомерный и безжалостный захват нашей планеты… " +
                        "Роман Герберта Уэллса «Война миров» (1897), задуманный писателем как еще одна (после «Машины времени») " +
                        "«атака на человеческое самодовольство», стал своего рода матрицей литературы об инопланетном вторжении, " +
                        "ввел моду на марсианскую тему в научной фантастике, лег в основу памятной радиоинсценировки Орсона Уэллса," +
                        " которая в октябре 1938 года вызвала панику среди американцев, и породил множество киноверсий. " +
                        "В настоящем издании в качестве приложения к тексту романа помещена статья Уэллса «Существа, которые " +
                        "обитают на Марсе» (1908), проливающая дополнительный свет на то, какими представляли себе гипотетических " +
                        "жителей красной планеты автор и некоторые его современники."

        ));

        list.add(new ListBook(
                "Герберт Уэллс",
                "Машина времени",
                R.drawable.time_mashine,
                "…раньше жители Верхнего Мира были привилегированным классом, а морлоки – их рабочими-слугами, но это " +
                        "давным-давно ушло в прошлое… Элои переродились в прекрасные ничтожества. Они все еще из милости владели" +
                        " поверхностью земли… но неумолимая Немезида неслышно приближалась к изнеженным счастливцам. Много веков" +
                        " назад человек лишил своего ближнего счастья и солнечного света. А теперь этот ближний стал совершенно " +
                        "неузнаваем! Элои снова получили начальный урок жизни. Они заново познакомились с чувством страха… "

        ));
        list.add(new ListBook(
                "Герберт Уэллс",
                "Когда спящий проснется",
                R.drawable.when_sleep,
                "Одна из первых во всемирной литературе антиутопий гениального Герберта Уэллса, талант которого одинаково " +
                        "легко позволял смотреть и сквозь века и в души людей. Однажды вы заснете. Заснете неожиданно и на безумно" +
                        " долгий срок. Сон без снов. Сон без разума. А когда откроете глаза, окажетесь в городе будущего, в городе" +
                        ", где все принадлежит вам, где вы стали иконой. Новый мир, новые технологии, новые люди, но..."

        ));
        list.add(new ListBook(
                "Джон Рональд Толкин",
                "Властелин колец: хранители кольца",
                R.drawable.guardians_of,
                "Сказания о Средиземье — это хроника Великой войны за Кольцо, войны, длившейся не одну тысячу лет. Тот, " +
                        "кто владел Кольцом, получал власть над всеми живыми тварями, но был обязан служить злу. Тихая деревня," +
                        " где живут хоббиты. Волшебник Гэндальф, придя на 111-й день рождения к своему старому другу Бильбо" +
                        " Бэггинсу, начинает вести разговор о кольце, которое Бильбо нашел много лет назад. Это кольцо " +
                        "принадлежало когда-то темному властителю Средиземья Саурону, и оно дает большую власть своему " +
                        "обладателю. Теперь Саурон хочет вернуть себе власть над Средиземьем. Бильбо отдает найденное" +
                        " кольцо своему племяннику Фродо, который пытается научиться справляться с тем страшным могуществом, " +
                        "которое дает ему кольцо…"

        ));
        list.add(new ListBook(
                "Джон Рональ Толкин",
                "Властелин колец: две твердыни",
                R.drawable.two_tower,
                "В процессе поисков Фродо Арагорн внезапно слышит рог Боромира. Он находит Боромира, смертельно " +
                        "раненного стрелами; нападавшие на него орки скрылись. Пока Боромир был ещё жив, Арагорн узнал " +
                        "от него, что Мерри и Пиппин были похищены орками, несмотря на усилия, приложенные Боромиром к" +
                        " их спасению, и что Фродо исчез из виду, после того, как Боромир пытался силой отобрать у него" +
                        " Кольцо, и что Боромир горько сожалеет о содеянном. В последние мгновения его жизни Боромир просит " +
                        "Арагорна защитить Минас Тирит от Саурона. Вместе с Леголасом и Гимли, которые сами сражались с " +
                        "орками, Арагорн отдает последние почести Боромиру и посылает его тело вниз по великой реке Андуину" +
                        " на погребальной лодке, поскольку обычные способы погребения были неприменимы. После этого Арагорн," +
                        " Леголас и Гимли решают преследовать банду урук-хай, похитивших хоббитов, и не мешкая отправляются" +
                        " в погоню...."

        ));
        list.add(new ListBook(
                "Джон Рональд Толкин",
                "Властелин колец: возвращение короля",
                R.drawable.return_king,
                "«Возвращение короля» Джона Р.Р. Толкина – последняя  и заключительная часть знаменитой фэнтези-саги " +
                        "«Властелин Колец». Эта сага вот уже более пятидесяти лет будоражит умы читателей по всему миру. " +
                        "Сложно найти человека, который не был бы знаком с такими яркими образами, как древний мудрый " +
                        "волшебник Гендальф, потомок и наследник древних королей Нуменора Арагорн, король Сломанного " +
                        "Меча, отважный принц лесных эльфов Леголас и его друг гном Гимли (а ведь дружба между эльфом и" +
                        " гномом огромная редкость, подчеркивает Толкин)."

        ));
        list.add(new ListBook(
                "Александр Беляев",
                "Голова профеcсора Доуэля",
                R.drawable.head_of_proff,
                "В книгу вошли два романа основоположника советской научной фантастики Александра Беляева -Властелин мира" +
                        "- и Голова профессора Доуэля, - которые объединяет тема дерзновенных и преступных научных экспериментов" +
                        " с сознанием и физической природой человека. Физиолог и банковский клерк Людвиг Штирнер посредством" +
                        " своего изобретения - мыслеизлучателя - подчиняет себе волю других людей, цинично манипулирует " +
                        "чужими судьбами и эмоциями и, стремясь к мировому господству, вступает в смертельное противостояние" +
                        " с финансовыми институтами, армиями и правительствами различных государств, со странами и континентами." +
                        " Талантливый хирург Доуэль, проведший серию успешных опытов по оживлению органов животных, становится " +
                        "жертвой собственного ассистента, который, реанимировав его голову, использует ее идеи в своих новых" +
                        " исследованиях - блистательных, шокирующих, выходящих за грань этики и закона…"

        ));
        list.add(null);
        list.add(new ListBook(
                "Александр Беляев",
                "Светопредстовление",
                R.drawable.light,
                "Берлин. Корреспонденты англичанин Лайль и француз Марамбалль изнывают от скуки, когда знакомый грек " +
                        "Метакса сообщает им о существовании тайного соглашения между Германией и Советской Россией. Однако," +
                        " их планы нарушаются катастрофическим событием — скорость света замедлилась настолько, что человек " +
                        "мог видеть себя же самого в кресле, с которого он давно встал, или призрак уже уехавшего трамвая." +
                        " Предметы проявлялись лишь по прошествии времени. Это вызвало огромные жертвы и нарушило обычную" +
                        " жизнь, но постепенно люди стали адаптироваться к изменившемуся миру..."

        ));
        list.add(new ListBook(
                "Александр Беляев",
                "Человек амфибия",
                R.drawable.man_the_amphibian,
                "Юный Ихтиандр - безусловно, самый знаменитый персонаж беляевской прозы - в результате дерзкого" +
                        " эксперимента, осуществленного некогда его приемным отцом, аргентинским хирургом Сальватором, " +
                        "обрел способность жить в водной стихии, которая дарит ему гармонию с природой и встречу с " +
                        "прекрасной Гуттиэре и одновременно становится его проклятием, навеки разлучая человека-амфибию" +
                        " с возлюбленной и с людским родом. "

        ));
        list.add(new ListBook(
                "Джонатан Свифт",
                "Путешествие Гуливера",
                R.drawable.travel,
                "Джонатан Свифт и его «Путешествия Гулливера» — одна из тех книг, что иначе читаются в разном возрасте." +
                        " Когда мы совсем маленькие, то приключения Гулливера для нас – лишь первая часть книги, путешествия в" +
                        " страну Лилипутов. Веселые, яркие истории о стране маленьких человечков, до смерти испугавшихся " +
                        "огромного путешественника – это читали в детстве практически все. Нередко в сокращенные сборники " +
                        "«Путешествий Гулливера» входит и вторая часть приключений – путешествие в страну великанов. " +
                        "Обычно мы так и считаем, что в «Путешествиях» всего две части, однако в более зрелом возрасте " +
                        "нам попадает не сокращенное, полное собрание приключений Лэмюэля Гулливера – сначала корабельного" +
                        " врача, а потом капитана флотилии кораблей. И тут мы обнаруживаем в продолжении едкую, острую " +
                        "сатиру, которая не теряет актуальности и в наше время. Летающий остров Лапута, населенный безумными м" +
                        "удрецами, которые настолько погружены в свои размышления и расчеты, что совершенно не реагируют" +
                        " на окружающий мир: в их стране можно общаться только с женщинами всех слоев общества и простонародьем," +
                        " не витающими в облаках. Далее путешествия продолжаются: герой посещает не менее" +
                        " фантастические страны Лаггнегг, Глаббдобдриб и Японию. Да, именно Япония – ведь в восемнадцатом веке" +
                        " эта совершенно закрытая страна была не менее экзотична, чем выдуманные Джонатаном Свифтом страны."

        ));
        list.add(new ListBook(
                        "Аркадий и Борис Стругацкие ",
                        "Суета вокруг дивана",
                        R.drawable.sofa,
                        "Суета вокруг дивана» — первая часть повести «Понедельник начинается в субботу». Авторами жанр" +
                                " повести определён, как «сказка для научных сотрудников младшего возраста». Всё начинается с" +
                                " того, что некий программист, путешествуя во время отпуска по Северу, встречает двоих местных" +
                                " жителей и подвозит их на своей машине до городка Соловец. Они оказываются сотрудниками некого" +
                                " НИИ и предлагают нашему путешественнику работу в Соловце, поскольку им «позарез нужен хороший " +
                                "программист». Попутчики, за неимением в Соловце гостиницы, устраивают его как будущего коллегу" +
                                " на ночлег в «Избе на курьих ногах», музее соловецкой старины. Вот с этого и начинаются" +
                                " приключения нашего программиста в Городе, населённом сказочными персонажами "

        ));
        list.add(new ListBook(
                "Джек Лондон ",
                "Смирительная рубашка",
                R.drawable.shirt,
                "Даррел Стэндинг, бывший профессор агрономии в Калифорнийском университете, приговорен к пожизненному " +
                        "заключению за совершенное им в припадке ярости убийство коллеги. Он провел восемь лет в тюрьме" +
                        " Сан-Квентин, подвергаясь за свою строптивость жестокому наказанию - затягиванию в брезентовую " +
                        "смирительную рубашку (ставшую вторым названием романа). " +
                        "Однако именно в этом мучительном состоянии он обрел поразительную способность умерщвлять" +
                        " собственное тело и раскрепощать подсознание, научился властвовать над временем и пространством" +
                        " и путешествовать по иным мирам и эпохам, заново проживая свои прошлые жизни. И теперь, находясь " +
                        "в тюрьме Фолсем, где он ожидает казни за нападение на охранника, Стэндинг рассказывает захватывающую" +
                        " историю своих реинкарнаций, утверждая идею бессмертия человеческого духа."

        ));
        list.add(new ListBook(
                "Алан Мур ",
                "Хранители",
                R.drawable.keepers,
                "Не надо быть энтузиастом массовой культуры, чтобы по первым двадцати страницам понять, что " +
                        "ХРАНИТЕЛИ - образец высокого, очень высокого искусства; а уж что будет на следующих двадцати..." +
                        " Не удивительно, что именно этот роман чаще прочих оказывается на верхней строчке в списках " +
                                "комиксов для людей, которые не читают комиксы. " +
                        "Чуть ли не на каждой странице из-под тебя как будто вышибают стул; иконопись, двигающиеся" +
                        " в раме окна фигурки, подсвеченные потусторонним светом, - вот на что это похоже; и поразительно," +
                        " сколько тонких вещей можно передать этими рисунками, как точно можно транслировать иронию - " +
                        "ну и базовые чувства, конечно: страх, сострадание, любовь, уныние. Смысл в том, что такой комикс," +
                        " как ХРАНИТЕЛИ - это совершенно особый, выглядящий страшно свежим способ рассказывать истории. " +
                        "И это именно литература, никоим образом не, например, живопись... Это роман, расширяющий представление" +
                        " о литературе вообще, о ее возможностях - и способностях к трансформации. И...."

        ));
        list.add(new ListBook(
                "Дэн Симмонс ",
                "Падение Гипериона",
                R.drawable.fall,
                "Дэн Симмонс - прославленный американский писатель, один из немногих, кто работает практически во всех" +
                        " жанрах - фэнтези, НФ, романов ужаса, исторических книг, детективов, мейнстрима. Его произведения " +
                        "переведены на множество языков и изданы в 27 странах. Однако у любителей фантастики его имя прочно " +
                        "ассоциируется с тетралогией о Гиперионе, заслужившей признание миллионов читателей.Дилогия Песни Гипериона" +
                        " описывает мир, поистине поражающий воображение своей сложностью, новизной и эпической масштабностью. " +
                        "Мир великой реки Тетис - и межзвездной Гегемонии, связывающей сотни планет нуль-порталами. " +
                        "Мир космических кочевников и всемогущих ИскИнов, таинственных Гробниц Времени и безжалостного " +
                        "ангела смерти Шрайка.Мир, в котором причудливо переплелись судьбы Солдата и Священника, " +
                        "Ученого и Поэта, Детектива и Консула."

        ));
        list.add(new ListBook(
                "Стивен Кинг ",
                "Зеленая миля",
                R.drawable.green,
                "Глубокий старик Пол Эджкомб, бывший тюремный надзиратель в блоке смертников тюрьмы" +
                        " Холодная гора, спустя много лет вспоминает необыкновенные события осени 1932 года. " +
                        "Год за годом Пол исправно служил, сопровождая преступников от камер до электрического " +
                        "стула по длинному, выстеленному зелёным линолеумом коридору, прозванного Зелёной милей." +
                        " Но он ни разу не встречался ни с кем подобным Джону Коффи. Чернокожий гигант, осуждённый " +
                        "за изнасилование и убийство двух маленьких сестёр, лишь внешне производил угрожающее впечатление, " +
                        "на самом же деле в поведении был прост и несколько наивен. А когда Коффи вылечил Пола от мучавшей " +
                        "его болезни, то он стал задаваться вопросом, может ли человек с таким даром быть убийцей?.. "

        ));
    }

}

