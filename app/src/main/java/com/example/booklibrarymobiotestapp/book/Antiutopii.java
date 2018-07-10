package com.example.booklibrarymobiotestapp.book;



import com.example.booklibrarymobiotestapp.R;

import java.util.ArrayList;

/**
 * Created by Vladislav on 09.07.2018.
 */

public class Antiutopii  {

    private ArrayList<ListBook> list;

    public ArrayList<ListBook> getArray(){
        return  list;
    }

    public void initilalizedData(){

        list = new ArrayList<ListBook>();

        list.add(new ListBook(
                "Рэй Брэдбери ",
                "451 градус по Фаренгейту",
                R.drawable._451,
                "В книге представлен роман-антиутопия Рэя Брэдбери 451? по Фаренгейту - классика научной фантастики." +
                        " В романе описан мир будущего, в котором книги безжалостно сжигаются отрядом пожарных, их запрещено " +
                        "читать в тоталитарном обществе. В центре романа - история пожарного Гая Монтага. Ряд трагических " +
                        "событий приводит его к пониманию того, что в жизни человека существуют истинные ценности, и он " +
                        "становится изгоем общества.Издание содержит сокращенный и адаптированный текст романа и адресовано " +
                        "учащимся 9-11 классов школ с углубленным изучением английского языка, а также широкому кругу читателей," +
                        " имеющих уровень языковой подготовки Intermediate.Текст романа снабжен словарем, постраничными " +
                        "комментариями, лексико-грамматическими упражнениями, творческими заданиями, заданиями на перевод," +
                        " вопросами на восприятие и для обсуждения.К книге выпущен диск (ID 472188) - в комплект не входит." +
                        " Прослушивание диска, записанного носителем языка, будет полезно для освоения произношения, а выполнение" +
                        " упражнений на аудирование поможет научиться воспринимать на слух английскую речь."

        ));

        list.add(new ListBook(
                "Джордж Оруэлл ",
                "1984",
                R.drawable._1984,
                "Всевидящее око Большого Брата стало одним из самых зловещих символов XX века. Во власти Большого Брата - " +
                        "постоянная слежка, проникновение идеологии в жизнь человека, подавление всякой мысли и индивидуального" +
                        " сознания, насаждение общественного мнения и культивирование управляемого бессознательного." +
                        " Роман Джорджа Оруэлла 1984 - литературный приговор самому страшному опыту столетия, " +
                        "беспримерное исследование технологии и психологии тоталитаризма со всеми его дьявольскими механизмами и" +
                        " изощренным инструментарием, предназначенными поглотить, перемолоть человеческую личность, превратить " +
                        "индивида в шуруп и винтик государственного механизма.Новое тысячелетие побуждает исследователей и" +
                        " читателей к новым интерпретациям знаменитой антиутопии, показавшей генеральную репетицию ада, его" +
                        " убедительный земной вариант. "
        ));
        list.add(new ListBook(
                "Олдос Хаксли ",
                "О дивный новый мир",
                R.drawable.brave,
                "О дивный новый мир - культовая антиутопия Олдоса Хаксли, изданная миллионными тиражами по всему миру.Роман " +
                        "о генетически программируемом обществе потребления, обществе всеобщего счастья, в котором разворачивается " +
                        "трагическая история человека, ставшего чужаком в этом мире…Остров - читайте в новом переводе!Идеи " +
                        "О дивного нового мира нашли продолжение в последнем, самом загадочном и мистическом романе Олдоса Хаксли" +
                         "Остров. Задуманное автором как антиутопия, это произведение оказалось гораздо масштабнее узких рамок" +
                        " утопического жанра.Удивительная и странная история совершенного общества свободных людей на затерянном" +
                        " в океане острове… Но однажды в этот мир счастливого неведения попадает человек извне..."

        ));
        list.add(new ListBook(
                "Джордж Оруэлл ",
                "Скотный двор",
                R.drawable.jard,
                "Повесть-сказка Скотный двор, рассказывающая об обитателях фермы животных, замкнутого мирка со своими " +
                        "заповедями и порядками, разворачивается в политическую сатиру. Животные перенимают самые отвратительные " +
                        "пороки людей, прежде всего - стремление к власти.Кроме знаменитой художественной прозы Оруэлла, в " +
                        "книге представлены его эссе, а также документальная повесть Памяти Каталонии и очерк Вспоминая войну в " +
                        "Испании, где беспристрастно отражены непосредственные впечатления писателя, побывавшего в рядах " +
                        "защитников испанской революции."

        ));
        list.add(new ListBook(
                "Кен Кизи ",
                "Над кукушкиным гнездом",
                R.drawable.nest,
                "Подобно многочисленным громким событиям, связанным с именем веселого проказника Кена Кизи, выход в 1962 " +
                        "году его первой книги Над кукушкиным гнездом произвел много шума в литературной жизни Америки. " +
                        "После ее появления Кизи был признан талантливейшим писателем, а сам роман стал одним из главных " +
                        "произведений движений битников и хиппи. Над кукушкиным гнездом - это грубое и опустошительно честное " +
                        "изображение границ между здравомыслием и безумием. Если кто-нибудь захочет ощутить пульс нашего времени, " +
                        "пусть лучше читает Кизи. И если все будет хорошо и не изменится порядок вещей, его будут читать и в" +
                        " следующем веке, - писали в Лос-Анджелес Тайме. Действительно, книга продолжает жить и не утратила " +
                        "прежней сумасшедшей популярности в наши дни.По мотивам романа был снят одноименный фильм" +
                        " Милошем Форманом, покоривший весь мир и получивший пять Оскаров, а также поставлено множество" +
                        " спектаклей в разных странах, в том числе в России"

        ));
        list.add(new ListBook(
                "Энтони Бёрджесс ",
                "Заводной апельсин",
                R.drawable.orange,
                "Заводной апельсин– потрясающий моноспектакль в исполнении Михаила Горевого с музыкальным сопровождением, " +
                        "точно и ярко иллюстрирующим шокирующие драматические события, происходящие в романе. Умный, " +
                        "жестокий, харизматичный антигерой Алекс, лидер уличной банды, проповедуя насилие как высокое " +
                        "искусство жизни, как род наслаждения, попадает в железные тиски новейшей государственной программы по" +
                        "перевоспитанию преступников и сам становится жертвой насилия… "

        ));
        list.add(new ListBook(
                "Руслан Галеев ",
                "Радио Хоспис",
                R.drawable.radio,
                "Темные страшные времена уже наступили: мир окружен Стеной, за которой зараженные люди превращаются в" +
                        " кровососущих чудовищ. Отгородившись от внешней опасности, никто и представить себе не мог, что " +
                        "бояться стоит не только зомби. Внутри самой Стены все не так спокойно и безопасно. Стсиснувшись " +
                        "с расследованием серийных убийств, главный герой – детектив Стас Бекчетов – и не подозревает, " +
                        "какую ужасную тайну ему предстоит открыть. Единственным лучом надежды среди обреченности и мрака" +
                        " становится запрещенное радио «Хоспис» и его таинственный ведущий, который, кажется, знает всё, " +
                        "что скрывает Правительство от уцелевших. Возможно ли избежать Апокалипсиса и где найти спасение " +
                        "человечеству, у которого нет будущего? Предыдущие романы Руслана Галеева «Каинов мост» и " +
                        "«Черепаховый суп» разошлись многотысячными тиражами и заняли достойное место в читательском " +
                        "рейтинге лучших книг об альтернативном будущем."

        ));
        list.add(null);
        list.add(new ListBook(
                "Сьюзен Коллинз",
                "Голодные игры",
                R.drawable.hunger,
                "Парень и девушка знакомы с детства и еще могут полюбить друг друга, но им придется стать врагами..." +
                        " По жребию они должны участвовать в страшных Голодных играх, где выживает только один — сильнейший." +
                        " Пока в жестоком квесте остаются хотя бы какие-то участники, Китнисс и Пит могут защищать друг друга и" +
                        " сражаться вместе. Но рано или поздно кому-то из них придется пожертвовать жизнью ради любимого..." +
                        " Таков закон Голодных игр. Закон, который не нарушался еще никогда!"

        ));
        list.add(new ListBook(
                "Стивен Кинг ",
                "Бегущий человек",
                R.drawable.running,
                "…Хотите заработать?! Отлично! Тогда примите участие в игре Бегущий человек - в шоу современных гладиаторов," +
                        " где слабые просто не доживают до финала……Довольный жизнью адвокат из маленького городка сбил" +
                        " машиной старуху из цыганского табора - и не понес наказания за содеянное. Тогда цыганский барон" +
                        " покарал его сам - и покарал так, что смерть в сравнении с этим проклятием была бы милостью… " +
                        "Романы, вошедшие в этот том, объединяет то, что все они - части колоссальной литературной " +
                        "мистификации Кинга, приписавшего их творческому наследию якобы непризнанного при жизни и " +
                        "случайно открытого им гениального писателя Ричарда Бахмана…"

        ));
        list.add(new ListBook(
                "Патрик Несс ",
                "Война хаоса",
                R.drawable.haous,
                "Три армии идут на Нью-Прентисстаун, каждая хочет уничтожить две другие. Тодд с Виолой оказываются " +
                        "между трех огней - и вырваться из этого ада невозможно. Как остановить кровопролитие? Как не " +
                        "потерять надежду на мир, когда у врага - такое численное преимущество? Если война действительно " +
                        "превращает людей в чудовищ, на какие страшные решения она толкнет главных героев? И тогда к истории " +
                        "подключается третий голос - голос, искаженный жаждой мести. Война хаоса - головокружительный " +
                        "финал трилогии Поступь Хаоса, удостоенной множества литературных премий," +
                        " мощный и динамичный роман о власти, выживании и ужасах войны. Как любой прорыв за грани воображения " +
                        "- а эта книга производит именно такой эффект - Война хаоса является выдающимся достижением литературы"

        ));
        list.add(new ListBook(
                "Бернард Беккет ",
                "Генезис-2075",
                R.drawable.genesis,
                "2075 год. Чума уничтожила практически все население Земли, лишь граждане Островной Республики сумели " +
                        "выжить, изолировав себя от окружающего мира. До смерти напуганные, они сбивают приближающиеся самолеты," +
                        " топят корабли, расстреливают любого, кто осмелится приблизиться к острову. А потом юноша по имени Адам " +
                        "Форд спасает полумертвую беженку, приплывшую на лодке...Адам Форд давно мертв.Теперь Анаксимандр " +
                        "предстает перед Экзаменаторами, демонстрируя им инсталляцию тех далеких времен. Ее цель: попасть в " +
                        "престижную Академию. Ее тема: деяния Адама и его бунт против Республики. Она чувствует странную " +
                        "близость, незримую связь с Адамом, но еще не представляет всей опасности своего положения."

        ));
        list.add(new ListBook(
                "Дмитрий Глуховский ",
                "Будущее",
                R.drawable.future,
                "На что ты готов ради вечной жизни? Уже при нашей жизни будут сделаны открытия, которые позволят людям " +
                        "оставаться вечно молодыми. Смерти больше нет. Наши дети не умрут никогда. Добро пожаловать в Будущее." +
                        " В мир, населенный вечно юными, совершенно здоровыми, счастливыми людьми. Но будут ли они такими же," +
                        " как мы? Нужны ли дети, если за них придется пожертвовать бессмертием? Нужна ли семья тем, кто не " +
                        "может завести детей? Нужна ли душа людям, тело которых не стареет? "

        ));
        list.add(new ListBook(
                "Дэннис Фун ",
                "Ловцы видений",
                R.drawable.catcher,
                "Первая книга трилогии Негасимый Свет - самого известного и захватывающего романа в жанре фэнтези в" +
                        " Северной Америке за последнее десятилетие. Главному герою в пятнадцать лет предстоит пройти через" +
                        " тяжелые испытания, столкнуться с невероятными приключениями, измениться самому и изменить окружающий мир."

        ));
        list.add(new ListBook(
                "Дэннис Фун ",
                "Вольный странник",
                R.drawable.free,
                "Вторая книга трилогии Негасимый Свет - самого известного и захватывающего романа в жанре" +
                " фэнтези в Северной Америке за последнее десятилетие. Роун продолжает поиски сестры, " +
                        "которая стала бездушным идолом Мегаполиса. Они оба наделены необыкновенными " +
                        "способностями и могут повлиять на грядущее глобальное столкновение сил Добра и Зла" +
                        " в эпоху после Мерзости..."

        ));
        list.add(new ListBook(
                "Паоло Бачигалупи ",
                "Народ песка и шлаков",
                R.drawable.narod,
                "В будущем, после радиации и ряда технологических изменений, выжившие люди стали технобионтами."+
                "Тем самым они отдалились от животного мира, который и так почти исчез…"+
                "Перестали ли они быть людьми? На пути Чена, Джака и Лизы, неунывающей троицы из группы быстрого реагирования, в одном из рейдов встречается " +
                        "тот, кто ненадолго изменит их жизни..."



        ));
    }

}
