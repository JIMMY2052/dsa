package dao;

/**
 *
 * @author KK
 */
import adt.*;
import entity.*;

public class Initializer {

    private SortedListInterface<Event> eventList = new SortedArrayList<>();
    private SortedListInterface<Volunteer> volunteerList = new SortedArrayList<>();

    public Initializer() {
        Event event1 = new Event("EV001", "Book Donation", "Gathering books for underserved schools and libraries.");
        Event event2 = new Event("EV002", "Food Drive", "Collecting non-perishable food items for the community.");
        Event event3 = new Event("EV003", "Blood Donation", "Organizing a blood donation drive in collaboration with the Red Cross.");
        Event event4 = new Event("EV004", "Toy Drive", "Collecting toys for children in low-income families during the holidays.");
        Event event5 = new Event("EV005", "Clothes Donation", "Collecting gently used clothes for homeless shelters.");

        Volunteer volunteer1 = new Volunteer(10001, "Daniel", 'M', "0123456789");
        Volunteer volunteer2 = new Volunteer(10002, "Emily", 'F', "9876543210");
        Volunteer volunteer3 = new Volunteer(10003, "Michael", 'M', "5551234567");
        Volunteer volunteer4 = new Volunteer(10004, "Sarah", 'F', "9012345678");
        Volunteer volunteer5 = new Volunteer(10005, "William", 'M', "1112223333");
        Volunteer volunteer6 = new Volunteer(10006, "Olivia", 'F', "4445556666");
        Volunteer volunteer7 = new Volunteer(10007, "James", 'M', "7778889999");
        Volunteer volunteer8 = new Volunteer(10008, "Ava", 'F', "3334445555");
        Volunteer volunteer9 = new Volunteer(10009, "George", 'M', "6667778888");
        Volunteer volunteer10 = new Volunteer(10010, "Isabella", 'F', "9990001111");
        Volunteer volunteer11 = new Volunteer(10011, "Charles", 'M', "2223334444");
        Volunteer volunteer12 = new Volunteer(10012, "Mia", 'F', "8889990000");
        Volunteer volunteer13 = new Volunteer(10013, "Thomas", 'M', "5556667777");
        Volunteer volunteer14 = new Volunteer(10014, "Charlotte", 'F', "1112223333");
        Volunteer volunteer15 = new Volunteer(10015, "Robert", 'M', "4445556666");
        Volunteer volunteer16 = new Volunteer(10016, "Amelia", 'F', "7778889999");
        Volunteer volunteer17 = new Volunteer(10017, "Richard", 'M', "3334445555");
        Volunteer volunteer18 = new Volunteer(10018, "Harper", 'F', "6667778888");
        Volunteer volunteer19 = new Volunteer(10019, "Joseph", 'M', "9990001111");
        Volunteer volunteer20 = new Volunteer(10020, "Evelyn", 'F', "2223334444");
        Volunteer volunteer21 = new Volunteer(10021, "John", 'M', "8889990000");
        Volunteer volunteer22 = new Volunteer(10022, "Abigail", 'F', "5556667777");
        Volunteer volunteer23 = new Volunteer(10023, "Paul", 'M', "1112223333");
        Volunteer volunteer24 = new Volunteer(10024, "Emily", 'F', "4445556666");
        Volunteer volunteer25 = new Volunteer(10025, "Kevin", 'M', "7778889999");
        Volunteer volunteer26 = new Volunteer(10026, "Lily", 'F', "3334445555");
        Volunteer volunteer27 = new Volunteer(10027, "Jason", 'M', "6667778888");
        Volunteer volunteer28 = new Volunteer(10028, "Madison", 'F', "9990001111");
        Volunteer volunteer29 = new Volunteer(10029, "Samuel", 'M', "2223334444");
        Volunteer volunteer30 = new Volunteer(10030, "Victoria", 'F', "8889990000");
        Volunteer volunteer31 = new Volunteer(10031, "Luke", 'M', "5556667777");
        Volunteer volunteer32 = new Volunteer(10032, "Jessica", 'F', "1112223333");
        Volunteer volunteer33 = new Volunteer(10033, "Mark", 'M', "4445556666");
        Volunteer volunteer34 = new Volunteer(10034, "Samantha", 'F', "7778889999");
        Volunteer volunteer35 = new Volunteer(10035, "Peter", 'M', "3334445555");
        Volunteer volunteer36 = new Volunteer(10036, "Avery", 'F', "6667778888");
        Volunteer volunteer37 = new Volunteer(10037, "Andrew", 'M', "9990001111");
        Volunteer volunteer38 = new Volunteer(10038, "Riley", 'F', "2223334444");
        Volunteer volunteer39 = new Volunteer(10039, "Benjamin", 'M', "8889990000");
        Volunteer volunteer40 = new Volunteer(10040, "Grace", 'F', "5556667777");
        Volunteer volunteer41 = new Volunteer(10041, "Alexander", 'M', "1112223333");
        Volunteer volunteer42 = new Volunteer(10042, "Natalie", 'F', "4445556666");
        Volunteer volunteer43 = new Volunteer(10043, "Jacob", 'M', "7778889999");
        Volunteer volunteer44 = new Volunteer(10044, "Sophia", 'F', "3334445555");
        Volunteer volunteer45 = new Volunteer(10045, "Ethan", 'M', "6667778888");
        Volunteer volunteer46 = new Volunteer(10046, "Zoey", 'F', "9990001111");
        Volunteer volunteer47 = new Volunteer(10047, "Michael", 'M', "2223334444");
        Volunteer volunteer48 = new Volunteer(10048, "Ella", 'F', "8889990000");
        Volunteer volunteer49 = new Volunteer(10049, "Joshua", 'M', "5556667777");
        Volunteer volunteer50 = new Volunteer(10050, "Chloe", 'F', "1112223333");
        Volunteer volunteer51 = new Volunteer(10051, "Sophia", 'F', "4445556666");
        Volunteer volunteer52 = new Volunteer(10052, "Mason", 'M', "7778889999");
        Volunteer volunteer53 = new Volunteer(10053, "Aiden", 'M', "3334445555");
        Volunteer volunteer54 = new Volunteer(10054, "Emma", 'F', "6667778888");
        Volunteer volunteer55 = new Volunteer(10055, "Liam", 'M', "9990001111");
        Volunteer volunteer56 = new Volunteer(10056, "Olivia", 'F', "2223334444");
        Volunteer volunteer57 = new Volunteer(10057, "Lucas", 'M', "8889990000");
        Volunteer volunteer58 = new Volunteer(10058, "Ava", 'F', "5556667777");
        Volunteer volunteer59 = new Volunteer(10059, "Noah", 'M', "1112223333");
        Volunteer volunteer60 = new Volunteer(10060, "Mia", 'F', "4445556666");
        Volunteer volunteer61 = new Volunteer(10061, "Ethan", 'M', "7778889999");
        Volunteer volunteer62 = new Volunteer(10062, "Amelia", 'F', "3334445555");
        Volunteer volunteer63 = new Volunteer(10063, "James", 'M', "6667778888");
        Volunteer volunteer64 = new Volunteer(10064, "Ella", 'F', "9990001111");
        Volunteer volunteer65 = new Volunteer(10065, "Benjamin", 'M', "2223334444");
        Volunteer volunteer66 = new Volunteer(10066, "Emily", 'F', "8889990000");
        Volunteer volunteer67 = new Volunteer(10067, "Logan", 'M', "5556667777");
        Volunteer volunteer68 = new Volunteer(10068, "Abigail", 'F', "1112223333");
        Volunteer volunteer69 = new Volunteer(10069, "Alexander", 'M', "4445556666");
        Volunteer volunteer70 = new Volunteer(10070, "Harper", 'F', "7778889999");
        Volunteer volunteer71 = new Volunteer(10071, "Sebastian", 'M', "3334445555");
        Volunteer volunteer72 = new Volunteer(10072, "Lily", 'F', "6667778888");
        Volunteer volunteer73 = new Volunteer(10073, "Matthew", 'M', "9990001111");
        Volunteer volunteer74 = new Volunteer(10074, "Samantha", 'F', "2223334444");
        Volunteer volunteer75 = new Volunteer(10075, "Owen", 'M', "8889990000");
        Volunteer volunteer76 = new Volunteer(10076, "Riley", 'F', "5556667777");
        Volunteer volunteer77 = new Volunteer(10077, "Jack", 'M', "1112223333");
        Volunteer volunteer78 = new Volunteer(10078, "Scarlett", 'F', "4445556666");
        Volunteer volunteer79 = new Volunteer(10079, "Henry", 'M', "7778889999");
        Volunteer volunteer80 = new Volunteer(10080, "Aria", 'F', "3334445555");
        Volunteer volunteer81 = new Volunteer(10081, "Leo", 'M', "6667778888");
        Volunteer volunteer82 = new Volunteer(10082, "Zoe", 'F', "9990001111");
        Volunteer volunteer83 = new Volunteer(10083, "Julian", 'M', "2223334444");
        Volunteer volunteer84 = new Volunteer(10084, "Layla", 'F', "8889990000");
        Volunteer volunteer85 = new Volunteer(10085, "Isaac", 'M', "5556667777");
        Volunteer volunteer86 = new Volunteer(10086, "Hannah", 'F', "1112223333");
        Volunteer volunteer87 = new Volunteer(10087, "Gabriel", 'M', "4445556666");
        Volunteer volunteer88 = new Volunteer(10088, "Aubrey", 'F', "7778889999");
        Volunteer volunteer89 = new Volunteer(10089, "David", 'M', "3334445555");
        Volunteer volunteer90 = new Volunteer(10090, "Savannah", 'F', "6667778888");
        Volunteer volunteer91 = new Volunteer(10091, "Wyatt", 'M', "9990001111");
        Volunteer volunteer92 = new Volunteer(10092, "Addison", 'F', "2223334444");
        Volunteer volunteer93 = new Volunteer(10093, "Carter", 'M', "8889990000");
        Volunteer volunteer94 = new Volunteer(10094, "Stella", 'F', "5556667777");
        Volunteer volunteer95 = new Volunteer(10095, "Isaiah", 'M', "1112223333");
        Volunteer volunteer96 = new Volunteer(10096, "Nora", 'F', "4445556666");
        Volunteer volunteer97 = new Volunteer(10097, "Anthony", 'M', "7778889999");
        Volunteer volunteer98 = new Volunteer(10098, "Brooklyn", 'F', "3334445555");
        Volunteer volunteer99 = new Volunteer(10099, "Thomas", 'M', "6667778888");
        Volunteer volunteer100 = new Volunteer(10100, "Luna", 'F', "9990001111");
        Volunteer volunteer101 = new Volunteer(10101, "Andrew", 'M', "2223334444");
        Volunteer volunteer102 = new Volunteer(10102, "Aurora", 'F', "8889990000");
        Volunteer volunteer103 = new Volunteer(10103, "Joshua", 'M', "5556667777");
        Volunteer volunteer104 = new Volunteer(10104, "Violet", 'F', "1112223333");
        Volunteer volunteer105 = new Volunteer(10105, "Caleb", 'M', "4445556666");
        Volunteer volunteer106 = new Volunteer(10106, "Victoria", 'F', "7778889999");
        Volunteer volunteer107 = new Volunteer(10107, "Luke", 'M', "3334445555");
        Volunteer volunteer108 = new Volunteer(10108, "Eleanor", 'F', "6667778888");
        Volunteer volunteer109 = new Volunteer(10109, "Samuel", 'M', "9990001111");
        Volunteer volunteer110 = new Volunteer(10110, "Hazel", 'F', "2223334444");
        Volunteer volunteer111 = new Volunteer(10111, "Nathan", 'M', "8889990000");
        Volunteer volunteer112 = new Volunteer(10112, "Penelope", 'F', "5556667777");
        Volunteer volunteer113 = new Volunteer(10113, "Eli", 'M', "1112223333");
        Volunteer volunteer114 = new Volunteer(10114, "Mila", 'F', "4445556666");
        Volunteer volunteer115 = new Volunteer(10115, "Aaron", 'M', "7778889999");
        Volunteer volunteer116 = new Volunteer(10116, "Paisley", 'F', "3334445555");
        Volunteer volunteer117 = new Volunteer(10117, "Hunter", 'M', "6667778888");
        Volunteer volunteer118 = new Volunteer(10118, "Ellie", 'F', "9990001111");
        Volunteer volunteer119 = new Volunteer(10119, "Ezekiel", 'M', "2223334444");
        Volunteer volunteer120 = new Volunteer(10120, "Skylar", 'F', "8889990000");
        Volunteer volunteer121 = new Volunteer(10121, "Gavin", 'M', "5556667777");
        Volunteer volunteer122 = new Volunteer(10122, "Leah", 'F', "1112223333");
        Volunteer volunteer123 = new Volunteer(10123, "Lincoln", 'M', "4445556666");
        Volunteer volunteer124 = new Volunteer(10124, "Hazel", 'F', "7778889999");
        Volunteer volunteer125 = new Volunteer(10125, "Christopher", 'M', "3334445555");
        Volunteer volunteer126 = new Volunteer(10126, "Anna", 'F', "6667778888");
        Volunteer volunteer127 = new Volunteer(10127, "Dominic", 'M', "9990001111");
        Volunteer volunteer128 = new Volunteer(10128, "Sarah", 'F', "2223334444");
        Volunteer volunteer129 = new Volunteer(10129, "Brayden", 'M', "8889990000");
        Volunteer volunteer130 = new Volunteer(10130, "Lillian", 'F', "5556667777");
        Volunteer volunteer131 = new Volunteer(10131, "Cameron", 'M', "1112223333");
        Volunteer volunteer132 = new Volunteer(10132, "Lucy", 'F', "4445556666");
        Volunteer volunteer133 = new Volunteer(10133, "Connor", 'M', "7778889999");
        Volunteer volunteer134 = new Volunteer(10134, "Allison", 'F', "3334445555");
        Volunteer volunteer135 = new Volunteer(10135, "Jordan", 'M', "6667778888");
        Volunteer volunteer136 = new Volunteer(10136, "Piper", 'F', "9990001111");
        Volunteer volunteer137 = new Volunteer(10137, "Jeremiah", 'M', "2223334444");
        Volunteer volunteer138 = new Volunteer(10138, "Adeline", 'F', "8889990000");
        Volunteer volunteer139 = new Volunteer(10139, "Nicholas", 'M', "5556667777");
        Volunteer volunteer140 = new Volunteer(10140, "Clara", 'F', "1112223333");
        Volunteer volunteer141 = new Volunteer(10141, "Jonathan", 'M', "4445556666");
        Volunteer volunteer142 = new Volunteer(10142, "Eva", 'F', "7778889999");
        Volunteer volunteer143 = new Volunteer(10143, "Isaiah", 'M', "3334445555");
        Volunteer volunteer144 = new Volunteer(10144, "Willow", 'F', "6667778888");
        Volunteer volunteer145 = new Volunteer(10145, "Evan", 'M', "9990001111");
        Volunteer volunteer146 = new Volunteer(10146, "Bella", 'F', "2223334444");
        Volunteer volunteer147 = new Volunteer(10147, "Adam", 'M', "8889990000");
        Volunteer volunteer148 = new Volunteer(10148, "Savannah", 'F', "5556667777");
        Volunteer volunteer149 = new Volunteer(10149, "Xavier", 'M', "1112223333");
        Volunteer volunteer150 = new Volunteer(10150, "Ariana", 'F', "4445556666");
        Volunteer volunteer151 = new Volunteer(10151, "Jaxon", 'M', "7778889999");
        Volunteer volunteer152 = new Volunteer(10152, "Aurora", 'F', "3334445555");
        Volunteer volunteer153 = new Volunteer(10153, "Tyler", 'M', "6667778888");
        Volunteer volunteer154 = new Volunteer(10154, "Violet", 'F', "9990001111");
        Volunteer volunteer155 = new Volunteer(10155, "Asher", 'M', "2223334444");
        Volunteer volunteer156 = new Volunteer(10156, "Penelope", 'F', "8889990000");
        Volunteer volunteer157 = new Volunteer(10157, "Leo", 'M', "5556667777");
        Volunteer volunteer158 = new Volunteer(10158, "Hannah", 'F', "1112223333");
        Volunteer volunteer159 = new Volunteer(10159, "Caleb", 'M', "4445556666");
        Volunteer volunteer160 = new Volunteer(10160, "Aria", 'F', "7778889999");
        Volunteer volunteer161 = new Volunteer(10161, "Landon", 'M', "3334445555");
        Volunteer volunteer162 = new Volunteer(10162, "Sophie", 'F', "6667778888");
        Volunteer volunteer163 = new Volunteer(10163, "Christian", 'M', "9990001111");
        Volunteer volunteer164 = new Volunteer(10164, "Madison", 'F', "2223334444");
        Volunteer volunteer165 = new Volunteer(10165, "Jace", 'M', "8889990000");
        Volunteer volunteer166 = new Volunteer(10166, "Eleanor", 'F', "5556667777");
        Volunteer volunteer167 = new Volunteer(10167, "Dylan", 'M', "1112223333");
        Volunteer volunteer168 = new Volunteer(10168, "Scarlett", 'F', "4445556666");
        Volunteer volunteer169 = new Volunteer(10169, "Grayson", 'M', "7778889999");
        Volunteer volunteer170 = new Volunteer(10170, "Aubrey", 'F', "3334445555");
        Volunteer volunteer171 = new Volunteer(10171, "Liam", 'M', "6667778888");
        Volunteer volunteer172 = new Volunteer(10172, "Zoe", 'F', "9990001111");
        Volunteer volunteer173 = new Volunteer(10173, "Henry", 'M', "2223334444");
        Volunteer volunteer174 = new Volunteer(10174, "Natalie", 'F', "8889990000");
        Volunteer volunteer175 = new Volunteer(10175, "Daniel", 'M', "5556667777");
        Volunteer volunteer176 = new Volunteer(10176, "Layla", 'F', "1112223333");
        Volunteer volunteer177 = new Volunteer(10177, "Isaac", 'M', "4445556666");
        Volunteer volunteer178 = new Volunteer(10178, "Ellie", 'F', "7778889999");
        Volunteer volunteer179 = new Volunteer(10179, "Luke", 'M', "3334445555");
        Volunteer volunteer180 = new Volunteer(10180, "Mila", 'F', "6667778888");
        Volunteer volunteer181 = new Volunteer(10181, "Wyatt", 'M', "9990001111");
        Volunteer volunteer182 = new Volunteer(10182, "Lily", 'F', "2223334444");
        Volunteer volunteer183 = new Volunteer(10183, "Joseph", 'M', "8889990000");
        Volunteer volunteer184 = new Volunteer(10184, "Amelia", 'F', "5556667777");
        Volunteer volunteer185 = new Volunteer(10185, "Ethan", 'M', "1112223333");
        Volunteer volunteer186 = new Volunteer(10186, "Maya", 'F', "4445556666");
        Volunteer volunteer187 = new Volunteer(10187, "Mason", 'M', "7778889999");
        Volunteer volunteer188 = new Volunteer(10188, "Grace", 'F', "3334445555");
        Volunteer volunteer189 = new Volunteer(10189, "Sebastian", 'M', "6667778888");
        Volunteer volunteer190 = new Volunteer(10190, "Luna", 'F', "9990001111");
        Volunteer volunteer191 = new Volunteer(10191, "Logan", 'M', "2223334444");
        Volunteer volunteer192 = new Volunteer(10192, "Chloe", 'F', "8889990000");
        Volunteer volunteer193 = new Volunteer(10193, "Cameron", 'M', "5556667777");
        Volunteer volunteer194 = new Volunteer(10194, "Stella", 'F', "1112223333");
        Volunteer volunteer195 = new Volunteer(10195, "Jacob", 'M', "4445556666");
        Volunteer volunteer196 = new Volunteer(10196, "Isabella", 'F', "7778889999");
        Volunteer volunteer197 = new Volunteer(10197, "Jackson", 'M', "3334445555");
        Volunteer volunteer198 = new Volunteer(10198, "Ava", 'F', "6667778888");
        Volunteer volunteer199 = new Volunteer(10199, "Carter", 'M', "9990001111");
        Volunteer volunteer200 = new Volunteer(10200, "Sophia", 'F', "2223334444");

        event1.addVolunteer(volunteer1);
        event1.addVolunteer(volunteer2);
        event1.addVolunteer(volunteer3);
        event1.addVolunteer(volunteer4);
        event1.addVolunteer(volunteer5);
        event1.addVolunteer(volunteer6);
        event1.addVolunteer(volunteer7);
        event1.addVolunteer(volunteer8);
        event1.addVolunteer(volunteer9);
        event1.addVolunteer(volunteer10);
        event1.addVolunteer(volunteer11);
        event1.addVolunteer(volunteer12);
        event1.addVolunteer(volunteer13);
        event1.addVolunteer(volunteer14);
        event1.addVolunteer(volunteer15);
        event1.addVolunteer(volunteer16);
        event1.addVolunteer(volunteer17);
        event1.addVolunteer(volunteer18);
        event1.addVolunteer(volunteer19);
        event1.addVolunteer(volunteer20);
        event2.addVolunteer(volunteer21);
        event2.addVolunteer(volunteer22);
        event2.addVolunteer(volunteer23);
        event2.addVolunteer(volunteer24);
        event2.addVolunteer(volunteer25);
        event2.addVolunteer(volunteer26);
        event2.addVolunteer(volunteer27);
        event2.addVolunteer(volunteer28);
        event2.addVolunteer(volunteer29);
        event2.addVolunteer(volunteer30);
        event2.addVolunteer(volunteer31);
        event2.addVolunteer(volunteer32);
        event2.addVolunteer(volunteer33);
        event2.addVolunteer(volunteer34);
        event2.addVolunteer(volunteer35);
        event2.addVolunteer(volunteer36);
        event2.addVolunteer(volunteer37);
        event2.addVolunteer(volunteer38);
        event2.addVolunteer(volunteer39);
        event2.addVolunteer(volunteer40);
        event3.addVolunteer(volunteer41);
        event3.addVolunteer(volunteer42);
        event3.addVolunteer(volunteer43);
        event3.addVolunteer(volunteer44);
        event3.addVolunteer(volunteer45);
        event3.addVolunteer(volunteer46);
        event3.addVolunteer(volunteer47);
        event3.addVolunteer(volunteer48);
        event3.addVolunteer(volunteer49);
        event3.addVolunteer(volunteer50);

        eventList.add(event1);
        eventList.add(event2);
        eventList.add(event3);
        eventList.add(event4);
        eventList.add(event5);

        volunteerList.add(volunteer1);
        volunteerList.add(volunteer2);
        volunteerList.add(volunteer3);
        volunteerList.add(volunteer4);
        volunteerList.add(volunteer5);
        volunteerList.add(volunteer6);
        volunteerList.add(volunteer7);
        volunteerList.add(volunteer8);
        volunteerList.add(volunteer9);
        volunteerList.add(volunteer10);
        volunteerList.add(volunteer11);
        volunteerList.add(volunteer12);
        volunteerList.add(volunteer13);
        volunteerList.add(volunteer14);
        volunteerList.add(volunteer15);
        volunteerList.add(volunteer16);
        volunteerList.add(volunteer17);
        volunteerList.add(volunteer18);
        volunteerList.add(volunteer19);
        volunteerList.add(volunteer20);
        volunteerList.add(volunteer21);
        volunteerList.add(volunteer22);
        volunteerList.add(volunteer23);
        volunteerList.add(volunteer24);
        volunteerList.add(volunteer25);
        volunteerList.add(volunteer26);
        volunteerList.add(volunteer27);
        volunteerList.add(volunteer28);
        volunteerList.add(volunteer29);
        volunteerList.add(volunteer30);
        volunteerList.add(volunteer31);
        volunteerList.add(volunteer32);
        volunteerList.add(volunteer33);
        volunteerList.add(volunteer34);
        volunteerList.add(volunteer35);
        volunteerList.add(volunteer36);
        volunteerList.add(volunteer37);
        volunteerList.add(volunteer38);
        volunteerList.add(volunteer39);
        volunteerList.add(volunteer40);
        volunteerList.add(volunteer41);
        volunteerList.add(volunteer42);
        volunteerList.add(volunteer43);
        volunteerList.add(volunteer44);
        volunteerList.add(volunteer45);
        volunteerList.add(volunteer46);
        volunteerList.add(volunteer47);
        volunteerList.add(volunteer48);
        volunteerList.add(volunteer49);
        volunteerList.add(volunteer50);
        volunteerList.add(volunteer51);
        volunteerList.add(volunteer52);
        volunteerList.add(volunteer53);
        volunteerList.add(volunteer54);
        volunteerList.add(volunteer55);
        volunteerList.add(volunteer56);
        volunteerList.add(volunteer57);
        volunteerList.add(volunteer58);
        volunteerList.add(volunteer59);
        volunteerList.add(volunteer60);
        volunteerList.add(volunteer61);
        volunteerList.add(volunteer62);
        volunteerList.add(volunteer63);
        volunteerList.add(volunteer64);
        volunteerList.add(volunteer65);
        volunteerList.add(volunteer66);
        volunteerList.add(volunteer67);
        volunteerList.add(volunteer68);
        volunteerList.add(volunteer69);
        volunteerList.add(volunteer70);
        volunteerList.add(volunteer71);
        volunteerList.add(volunteer72);
        volunteerList.add(volunteer73);
        volunteerList.add(volunteer74);
        volunteerList.add(volunteer75);
        volunteerList.add(volunteer76);
        volunteerList.add(volunteer77);
        volunteerList.add(volunteer78);
        volunteerList.add(volunteer79);
        volunteerList.add(volunteer80);
        volunteerList.add(volunteer81);
        volunteerList.add(volunteer82);
        volunteerList.add(volunteer83);
        volunteerList.add(volunteer84);
        volunteerList.add(volunteer85);
        volunteerList.add(volunteer86);
        volunteerList.add(volunteer87);
        volunteerList.add(volunteer88);
        volunteerList.add(volunteer89);
        volunteerList.add(volunteer90);
        volunteerList.add(volunteer91);
        volunteerList.add(volunteer92);
        volunteerList.add(volunteer93);
        volunteerList.add(volunteer94);
        volunteerList.add(volunteer95);
        volunteerList.add(volunteer96);
        volunteerList.add(volunteer97);
        volunteerList.add(volunteer98);
        volunteerList.add(volunteer99);
        volunteerList.add(volunteer100);
        volunteerList.add(volunteer101);
        volunteerList.add(volunteer102);
        volunteerList.add(volunteer103);
        volunteerList.add(volunteer104);
        volunteerList.add(volunteer105);
        volunteerList.add(volunteer106);
        volunteerList.add(volunteer107);
        volunteerList.add(volunteer108);
        volunteerList.add(volunteer109);
        volunteerList.add(volunteer110);
        volunteerList.add(volunteer111);
        volunteerList.add(volunteer112);
        volunteerList.add(volunteer113);
        volunteerList.add(volunteer114);
        volunteerList.add(volunteer115);
        volunteerList.add(volunteer116);
        volunteerList.add(volunteer117);
        volunteerList.add(volunteer118);
        volunteerList.add(volunteer119);
        volunteerList.add(volunteer120);
        volunteerList.add(volunteer121);
        volunteerList.add(volunteer122);
        volunteerList.add(volunteer123);
        volunteerList.add(volunteer124);
        volunteerList.add(volunteer125);
        volunteerList.add(volunteer126);
        volunteerList.add(volunteer127);
        volunteerList.add(volunteer128);
        volunteerList.add(volunteer129);
        volunteerList.add(volunteer130);
        volunteerList.add(volunteer131);
        volunteerList.add(volunteer132);
        volunteerList.add(volunteer133);
        volunteerList.add(volunteer134);
        volunteerList.add(volunteer135);
        volunteerList.add(volunteer136);
        volunteerList.add(volunteer137);
        volunteerList.add(volunteer138);
        volunteerList.add(volunteer139);
        volunteerList.add(volunteer140);
        volunteerList.add(volunteer141);
        volunteerList.add(volunteer142);
        volunteerList.add(volunteer143);
        volunteerList.add(volunteer144);
        volunteerList.add(volunteer145);
        volunteerList.add(volunteer146);
        volunteerList.add(volunteer147);
        volunteerList.add(volunteer148);
        volunteerList.add(volunteer149);
        volunteerList.add(volunteer150);
        volunteerList.add(volunteer151);
        volunteerList.add(volunteer152);
        volunteerList.add(volunteer153);
        volunteerList.add(volunteer154);
        volunteerList.add(volunteer155);
        volunteerList.add(volunteer156);
        volunteerList.add(volunteer157);
        volunteerList.add(volunteer158);
        volunteerList.add(volunteer159);
        volunteerList.add(volunteer160);
        volunteerList.add(volunteer161);
        volunteerList.add(volunteer162);
        volunteerList.add(volunteer163);
        volunteerList.add(volunteer164);
        volunteerList.add(volunteer165);
        volunteerList.add(volunteer166);
        volunteerList.add(volunteer167);
        volunteerList.add(volunteer168);
        volunteerList.add(volunteer169);
        volunteerList.add(volunteer170);
        volunteerList.add(volunteer171);
        volunteerList.add(volunteer172);
        volunteerList.add(volunteer173);
        volunteerList.add(volunteer174);
        volunteerList.add(volunteer175);
        volunteerList.add(volunteer176);
        volunteerList.add(volunteer177);
        volunteerList.add(volunteer178);
        volunteerList.add(volunteer179);
        volunteerList.add(volunteer180);
        volunteerList.add(volunteer181);
        volunteerList.add(volunteer182);
        volunteerList.add(volunteer183);
        volunteerList.add(volunteer184);
        volunteerList.add(volunteer185);
        volunteerList.add(volunteer186);
        volunteerList.add(volunteer187);
        volunteerList.add(volunteer188);
        volunteerList.add(volunteer189);
        volunteerList.add(volunteer190);
        volunteerList.add(volunteer191);
        volunteerList.add(volunteer192);
        volunteerList.add(volunteer193);
        volunteerList.add(volunteer194);
        volunteerList.add(volunteer195);
        volunteerList.add(volunteer196);
        volunteerList.add(volunteer197);
        volunteerList.add(volunteer198);
        volunteerList.add(volunteer199);
        volunteerList.add(volunteer200);
    }

    public SortedListInterface<Event> getEventList() {
        return eventList;
    }

    public SortedListInterface<Volunteer> getVolunteerList() {
        return volunteerList;
    }

    public SortedListInterface<Donor> initializeDonor() {

        SortedListInterface<Donor> donors = new SortedArrayList<>();

        donors.add(new Donor("JIMMY", "0105772052", "public", "male"));
        donors.add(new Donor("JIE YANG", "0105284838", "private", "male"));
        donors.add(new Donor("CHUN YIN", "0106655478", "public", "female"));
        donors.add(new Donor("STEVEN", "0101111111", "private", "female"));
        donors.add(new Donor("KENGKEONG", "0102222222", "government", "male"));
        donors.add(new Donor("JIAQIAN", "0103333333", "government", "female"));

        return donors;
    }

//    public SortedListInterface<DonatedItem> initializeDonatedItem() {
//
//        SortedListInterface<DonatedItem> donatedItems = new SortedArrayList<>();
//
//        donatedItems.add(new DonatedItem("CASH", 2000, "RM"));
//        donatedItems.add(new DonatedItem("MILO", 200, "KG"));
//        donatedItems.add(new DonatedItem("RICE", 10, "KG"));
//        donatedItems.add(new DonatedItem("MILK", 10, "L"));
//        donatedItems.add(new DonatedItem("OIL", 10, "L"));
//        donatedItems.add(new DonatedItem("CLOTHES", 100, "unit"));
//        return donatedItems;
//    }
    public SortedListInterface<Donation> initializeDonation() {

        SortedListInterface<Donation> donations = new SortedArrayList<>();
        Donation d1 = new Donation(new Donor("JIMMY", "0105772052", "public", "male"), "F");
        Donation d2 = new Donation(new Donor("JIE YANG", "0105284838", "private", "male"), "F");
        Donation d3 = new Donation(new Donor("CHUN YIN", "0106655478", "public", "female"), "F");
        Donation d4 = new Donation(new Donor("STEVEN", "0101111111", "private", "female"), "C");
        
        d1.addDonatedItem(new DonatedItem("SPAHETTI", 2000, "L"));
        d1.addDonatedItem(new DonatedItem("MILO", 200, "KG"));
        d1.addDonatedItem(new DonatedItem("RICE", 10, "KG"));
        d1.addDonatedItem(new DonatedItem("MILO", 200, "KG"));
        d1.addDonatedItem(new DonatedItem("RICE", 10, "KG"));
        d2.addDonatedItem(new DonatedItem("OIL", 10, "L"));
        d3.addDonatedItem(new DonatedItem("OIL", 10, "L"));
        d4.addDonatedItem(new DonatedItem("CASH", 2000, "RM"));
        donations.add(d1);
        donations.add(d2);
        donations.add(d3);
        donations.add(d4);

        return donations;

    }
}
