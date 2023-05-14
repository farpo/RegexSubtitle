package eu.ansquare.regexsubtitle;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            String input = "WEBVTT \n" +
                    "\n" +
                    "1\n" +
                    "00:00:06.640 --> 00:00:08.800 align:middle\n" +
                    "<c.textWhite>Freitagabend,</c>\n" +
                    "<c.textWhite>im Fernsehen, im Internet,</c>\n" +
                    "\n" +
                    "2\n" +
                    "00:00:08.840 --> 00:00:10.560 align:middle\n" +
                    "<c.textWhite>wo auch immer ihr grad' zuguckt.</c>\n" +
                    "\n" +
                    "3\n" +
                    "00:00:10.600 --> 00:00:13.640 align:middle\n" +
                    "<c.textWhite>Schön, dass ihr da seid,</c>\n" +
                    "<c.textWhite>ich bin Linda und darum geht's:</c>\n" +
                    "\n" +
                    "4\n" +
                    "00:00:13.680 --> 00:00:17.560 align:middle\n" +
                    "<c.textWhite>Mannomann! -</c>\n" +
                    "<c.textWhite>Elterntaxis nerven manchmal richtig.</c>\n" +
                    "\n" +
                    "5\n" +
                    "00:00:17.600 --> 00:00:21.800 align:middle\n" +
                    "<c.textWhite>Da hilft nur:</c>\n" +
                    "<c.textWhite>Straße sperren und losspielen.</c>\n" +
                    "\n" +
                    "6\n" +
                    "00:00:21.840 --> 00:00:24.920 align:middle\n" +
                    "<c.textWhite>Ehrenmann! - Dieser Sportler</c>\n" +
                    "<c.textWhite>hat 'nen Preis gekriegt,</c>\n" +
                    "\n" +
                    "7\n" +
                    "00:00:24.960 --> 00:00:26.920 align:middle\n" +
                    "<c.textWhite>ohne einen Wettkampf zu gewinnen.</c>\n" +
                    "\n" +
                    "8\n" +
                    "00:00:26.960 --> 00:00:31.400 align:middle\n" +
                    "<c.textWhite>Und: O Mann! -</c>\n" +
                    "<c.textWhite>Was macht denn dieser Elch im Kino?</c>\n" +
                    "\n" +
                    "9\n" +
                    "00:00:31.440 --> 00:00:34.120 align:middle\n" +
                    "<c.textWhite>Der will doch nicht etwa, oh oh...</c>\n" +
                    "\n" +
                    "10\n" +
                    "00:00:36.240 --> 00:00:37.720 align:middle\n" +
                    "<c.textWhite>Hallo bei \"logo!\".</c>\n" +
                    "\n" +
                    "11\n" +
                    "00:00:37.760 --> 00:00:39.280 align:middle\n" +
                    "<c.textWhite>Jeden Morgen, so gegen acht,</c>\n" +
                    "\n" +
                    "12\n" +
                    "00:00:39.320 --> 00:00:42.600 align:middle\n" +
                    "<c.textWhite>an so vielen Schulen in Deutschland,</c>\n" +
                    "<c.textWhite>immer so:</c>\n" +
                    "\n" +
                    "13\n" +
                    "00:00:42.640 --> 00:00:48.200 align:middle\n" +
                    "<c.textWhite>* Hupen und Rufe durcheinander *</c>\n" +
                    "\n" +
                    "14\n" +
                    "00:00:48.240 --> 00:00:53.120 align:middle\n" +
                    "<c.textWhite>Eltern, Kinder, alle voll im Stress.</c>\n" +
                    "\n" +
                    "15\n" +
                    "00:00:53.160 --> 00:00:55.480 align:middle\n" +
                    "<c.textWhite>Klar, das ist dann auch gefährlich.</c>\n" +
                    "\n" +
                    "16\n" +
                    "00:00:55.520 --> 00:00:57.720 align:middle\n" +
                    "<c.textWhite>Und deshalb setzen sich</c>\n" +
                    "<c.textWhite>immer mehr Schulen</c>\n" +
                    "\n" +
                    "17\n" +
                    "00:00:57.760 --> 00:00:59.880 align:middle\n" +
                    "<c.textWhite>für autofreie Schulstraßen ein.</c>\n" +
                    "\n" +
                    "18\n" +
                    "00:00:59.920 --> 00:01:01.680 align:middle\n" +
                    "<c.textWhite>So wie hier in Berlin.</c>\n" +
                    "\n" +
                    "19\n" +
                    "00:01:01.720 --> 00:01:04.200 align:middle\n" +
                    "<c.textYellow>Vorfahrt für Kinder.</c>\n" +
                    "\n" +
                    "20\n" +
                    "00:01:04.240 --> 00:01:06.440 align:middle\n" +
                    "<c.textYellow>Autos haben hier heute</c>\n" +
                    "<c.textYellow>nichts zu suchen.</c>\n" +
                    "\n" +
                    "21\n" +
                    "00:01:06.480 --> 00:01:09.600 align:middle\n" +
                    "<c.textYellow>Für sie ist der Tietzenweg</c>\n" +
                    "<c.textYellow>in Berlin Lichterfelde</c>\n" +
                    "\n" +
                    "22\n" +
                    "00:01:09.640 --> 00:01:13.560 align:middle\n" +
                    "<c.textYellow>an diesem Morgen gesperrt.</c>\n" +
                    "\n" +
                    "23\n" +
                    "00:01:13.600 --> 00:01:17.720 align:middle\n" +
                    "<c.textCyan>Ich finde das gut,</c>\n" +
                    "<c.textCyan>dass die Autos an diesem Tag</c>\n" +
                    "\n" +
                    "24\n" +
                    "00:01:17.760 --> 00:01:20.520 align:middle\n" +
                    "<c.textCyan>nicht hier lang fahren dürfen.</c>\n" +
                    "\n" +
                    "25\n" +
                    "00:01:20.560 --> 00:01:22.320 align:middle\n" +
                    "<c.textYellow>Warum?</c>\n" +
                    "\n" +
                    "26\n" +
                    "00:01:22.360 --> 00:01:28.760 align:middle\n" +
                    "<c.textCyan>Weil man kann ja auch</c>\n" +
                    "<c.textCyan>dann hier spielen.</c>\n" +
                    "\n" +
                    "27\n" +
                    "00:01:28.800 --> 00:01:31.920 align:middle\n" +
                    "<c.textYellow>Zwei Schulen liegen</c>\n" +
                    "<c.textYellow>hier genau gegenüber.</c>\n" +
                    "\n" +
                    "28\n" +
                    "00:01:31.960 --> 00:01:34.800 align:middle\n" +
                    "<c.textYellow>Sie machen mit bei der Aktion</c>\n" +
                    "<c.textYellow>für sichere Schulwege.</c>\n" +
                    "\n" +
                    "29\n" +
                    "00:01:34.840 --> 00:01:38.520 align:middle\n" +
                    "<c.textYellow>Das Ziel:</c>\n" +
                    "<c.textYellow>autofreie Straßen vor Schulen.</c>\n" +
                    "\n" +
                    "30\n" +
                    "00:01:38.560 --> 00:01:41.640 align:middle\n" +
                    "<c.textYellow>Wo sie jetzt gefahrlos spielen,</c>\n" +
                    "<c.textYellow>kommt man an anderen Tagen</c>\n" +
                    "\n" +
                    "31\n" +
                    "00:01:41.680 --> 00:01:45.400 align:middle\n" +
                    "<c.textYellow>vor lauter Verkehr</c>\n" +
                    "<c.textYellow>kaum über die Straße.</c>\n" +
                    "\n" +
                    "32\n" +
                    "00:01:45.440 --> 00:01:48.000 align:middle\n" +
                    "<c.textCyan>Ansonsten rasen hier manchmal</c>\n" +
                    "<c.textCyan>die Autos so lang,</c>\n" +
                    "\n" +
                    "33\n" +
                    "00:01:48.040 --> 00:01:53.080 align:middle\n" +
                    "<c.textCyan>dass die uns fast überfahren.</c>\n" +
                    "\n" +
                    "34\n" +
                    "00:01:53.120 --> 00:01:57.400 align:middle\n" +
                    "<c.textCyan>Ich komme meistens zu Fuß zur Schule</c>\n" +
                    "<c.textCyan>und ich sehe hier immer viel Verkehr</c>\n" +
                    "\n" +
                    "35\n" +
                    "00:01:57.440 --> 00:01:59.880 align:middle\n" +
                    "<c.textCyan>die Autos fahren kreuz und quer.</c>\n" +
                    "\n" +
                    "36\n" +
                    "00:01:59.920 --> 00:02:05.800 align:middle\n" +
                    "<c.textCyan>Es ist schon sehr voll, viele Autos.</c>\n" +
                    "\n" +
                    "37\n" +
                    "00:02:05.840 --> 00:02:11.000 align:middle\n" +
                    "<c.textCyan>Dann braucht man auch wirklich lange</c>\n" +
                    "<c.textCyan>um hier sicher rüberzukommen.</c>\n" +
                    "\n" +
                    "38\n" +
                    "00:02:11.040 --> 00:02:14.280 align:middle\n" +
                    "<c.textYellow>Das Problem ist, dass viele Eltern,</c>\n" +
                    "<c.textYellow>ihre Kinder mit dem Auto</c>\n" +
                    "\n" +
                    "39\n" +
                    "00:02:14.320 --> 00:02:18.000 align:middle\n" +
                    "<c.textYellow>bis vor die Schule bringen</c>\n" +
                    "<c.textYellow>und so die Straße verstopfen.</c>\n" +
                    "\n" +
                    "40\n" +
                    "00:02:18.040 --> 00:02:21.400 align:middle\n" +
                    "<c.textYellow>Heute aber gehört der Platz</c>\n" +
                    "<c.textYellow>vor ihrer Schule nur ihnen.</c>\n" +
                    "\n" +
                    "41\n" +
                    "00:02:21.440 --> 00:02:24.800 align:middle\n" +
                    "<c.textCyan>Es ist so, dass die Straße</c>\n" +
                    "<c.textCyan>halt auch so groß ist,</c>\n" +
                    "\n" +
                    "42\n" +
                    "00:02:24.840 --> 00:02:28.840 align:middle\n" +
                    "<c.textCyan>dass man sich da</c>\n" +
                    "<c.textCyan>richtig gut austoben könnte</c>\n" +
                    "\n" +
                    "43\n" +
                    "00:02:28.880 --> 00:02:32.680 align:middle\n" +
                    "<c.textCyan>und das finde ich schön,</c>\n" +
                    "<c.textCyan>dass wir das heute machen können.</c>\n" +
                    "\n" +
                    "44\n" +
                    "00:02:32.720 --> 00:02:35.880 align:middle\n" +
                    "<c.textCyan>Es wäre schon leichter,</c>\n" +
                    "<c.textCyan>wenn nicht so viele Autos da wären,</c>\n" +
                    "\n" +
                    "45\n" +
                    "00:02:35.920 --> 00:02:38.520 align:middle\n" +
                    "<c.textCyan>weil dann muss man nicht</c>\n" +
                    "<c.textCyan>so dolle aufpassen.</c>\n" +
                    "\n" +
                    "46\n" +
                    "00:02:38.560 --> 00:02:42.760 align:middle\n" +
                    "<c.textYellow>Ideen, was man auf so einer</c>\n" +
                    "<c.textYellow>autofreien Straße alles machen kann,</c>\n" +
                    "\n" +
                    "47\n" +
                    "00:02:42.800 --> 00:02:44.480 align:middle\n" +
                    "<c.textYellow>haben sie genug.</c>\n" +
                    "\n" +
                    "48\n" +
                    "00:02:44.520 --> 00:02:47.880 align:middle\n" +
                    "<c.textYellow>Und hoffen, dass die Eltern</c>\n" +
                    "<c.textYellow>ihre Kinder öfter mit dem Fahrrad,</c>\n" +
                    "\n" +
                    "49\n" +
                    "00:02:47.920 --> 00:02:50.760 align:middle\n" +
                    "<c.textYellow>statt mit dem Auto</c>\n" +
                    "<c.textYellow>zur Schule bringen.</c>\n" +
                    "\n" +
                    "50\n" +
                    "00:02:50.800 --> 00:02:55.400 align:middle\n" +
                    "<c.textWhite>Mitte Mai findet in der Türkei</c>\n" +
                    "<c.textWhite>eine wichtige Wahl statt:</c>\n" +
                    "\n" +
                    "51\n" +
                    "00:02:55.440 --> 00:02:57.080 align:middle\n" +
                    "<c.textWhite>Die Präsidentschaftswahl.</c>\n" +
                    "\n" +
                    "52\n" +
                    "00:02:57.120 --> 00:03:00.560 align:middle\n" +
                    "<c.textWhite>Da geht's dann also darum,</c>\n" +
                    "<c.textWhite>wer in dem Land das Sagen haben soll.</c>\n" +
                    "\n" +
                    "53\n" +
                    "00:03:00.600 --> 00:03:02.600 align:middle\n" +
                    "<c.textWhite>Und das Interessante an dieser Wahl:</c>\n" +
                    "\n" +
                    "54\n" +
                    "00:03:02.640 --> 00:03:05.560 align:middle\n" +
                    "<c.textWhite>Auch in Deutschland leben</c>\n" +
                    "<c.textWhite>anderthalb Millionen Menschen</c>\n" +
                    "\n" +
                    "55\n" +
                    "00:03:05.600 --> 00:03:07.840 align:middle\n" +
                    "<c.textWhite>mit türkischem Pass,</c>\n" +
                    "<c.textWhite>die Mitwählen dürfen.</c>\n" +
                    "\n" +
                    "56\n" +
                    "00:03:07.880 --> 00:03:10.120 align:middle\n" +
                    "<c.textWhite>Die müssen dafür</c>\n" +
                    "<c.textWhite>nicht extra in die Türkei,</c>\n" +
                    "\n" +
                    "57\n" +
                    "00:03:10.160 --> 00:03:13.520 align:middle\n" +
                    "<c.textWhite>sondern können das jetzt an einigen</c>\n" +
                    "<c.textWhite>Orten in Deutschland machen.</c>\n" +
                    "\n" +
                    "58\n" +
                    "00:03:13.560 --> 00:03:16.200 align:middle\n" +
                    "<c.textWhite>Aktuell ist er hier Präsident.</c>\n" +
                    "\n" +
                    "59\n" +
                    "00:03:16.240 --> 00:03:17.760 align:middle\n" +
                    "<c.textWhite>Recep Tayyip Erdogan.</c>\n" +
                    "\n" +
                    "60\n" +
                    "00:03:17.800 --> 00:03:21.240 align:middle\n" +
                    "<c.textWhite>Und wie vermutlich fast alle</c>\n" +
                    "<c.textWhite>Präsidenten, will er's auch bleiben.</c>\n" +
                    "\n" +
                    "61\n" +
                    "00:03:21.280 --> 00:03:24.200 align:middle\n" +
                    "<c.textWhite>Doch es gibt im Moment auch</c>\n" +
                    "<c.textWhite>viel Kritik an Erdogan.</c>\n" +
                    "\n" +
                    "62\n" +
                    "00:03:24.240 --> 00:03:28.640 align:middle\n" +
                    "<c.textYellow>Einige Menschen in der Türkei sind</c>\n" +
                    "<c.textYellow>mit Präsident Erdogan unzufrieden.</c>\n" +
                    "\n" +
                    "63\n" +
                    "00:03:28.680 --> 00:03:31.480 align:middle\n" +
                    "<c.textYellow>Das hat auch mit der Situation</c>\n" +
                    "<c.textYellow>in ihrem Land zu tun.</c>\n" +
                    "\n" +
                    "64\n" +
                    "00:03:31.520 --> 00:03:34.280 align:middle\n" +
                    "<c.textYellow>Zum Beispiel können sich</c>\n" +
                    "<c.textYellow>die Menschen von ihrem Geld</c>\n" +
                    "\n" +
                    "65\n" +
                    "00:03:34.320 --> 00:03:36.080 align:middle\n" +
                    "<c.textYellow>immer weniger leisten.</c>\n" +
                    "\n" +
                    "66\n" +
                    "00:03:36.120 --> 00:03:39.880 align:middle\n" +
                    "<c.textYellow>Lebensmittel, Medikamente und andere</c>\n" +
                    "<c.textYellow>Dinge, die man zum Leben braucht,</c>\n" +
                    "\n" +
                    "67\n" +
                    "00:03:39.920 --> 00:03:43.280 align:middle\n" +
                    "<c.textYellow>sind in den letzten Jahren</c>\n" +
                    "<c.textYellow>viel teurer geworden.</c>\n" +
                    "\n" +
                    "68\n" +
                    "00:03:43.320 --> 00:03:46.000 align:middle\n" +
                    "<c.textYellow>Für viele ist das</c>\n" +
                    "<c.textYellow>kaum noch bezahlbar.</c>\n" +
                    "\n" +
                    "69\n" +
                    "00:03:46.040 --> 00:03:50.840 align:middle\n" +
                    "<c.textYellow>Auch nach dem schweren Erdbeben</c>\n" +
                    "<c.textYellow>im Februar haben viele beklagt,</c>\n" +
                    "\n" +
                    "70\n" +
                    "00:03:50.880 --> 00:03:53.600 align:middle\n" +
                    "<c.textYellow>wie die Hilfe für die Menschen lief.</c>\n" +
                    "\n" +
                    "71\n" +
                    "00:03:53.640 --> 00:03:56.640 align:middle\n" +
                    "<c.textYellow>Bei dem Beben</c>\n" +
                    "<c.textYellow>sind im Südosten der Türkei</c>\n" +
                    "\n" +
                    "72\n" +
                    "00:03:56.680 --> 00:03:59.080 align:middle\n" +
                    "<c.textYellow>mehr als 50.000 Menschen gestorben.</c>\n" +
                    "\n" +
                    "73\n" +
                    "00:03:59.120 --> 00:04:01.200 align:middle\n" +
                    "<c.textYellow>Etliche Häuser wurden zerstört.</c>\n" +
                    "\n" +
                    "74\n" +
                    "00:04:01.240 --> 00:04:05.720 align:middle\n" +
                    "<c.textYellow>Teilweise dauerte es mehrere Tage,</c>\n" +
                    "<c.textYellow>bis Hilfe zu den Menschen kam.</c>\n" +
                    "\n" +
                    "75\n" +
                    "00:04:05.760 --> 00:04:09.400 align:middle\n" +
                    "<c.textYellow>Und: einige Häuser sind wohl</c>\n" +
                    "<c.textYellow>auch deshalb eingestürzt,</c>\n" +
                    "\n" +
                    "76\n" +
                    "00:04:09.440 --> 00:04:11.960 align:middle\n" +
                    "<c.textYellow>weil sie nicht sicher genug</c>\n" +
                    "<c.textYellow>gebaut waren.</c>\n" +
                    "\n" +
                    "77\n" +
                    "00:04:12.000 --> 00:04:14.880 align:middle\n" +
                    "<c.textYellow>Die Regierung von Erdogan</c>\n" +
                    "<c.textYellow>soll davon gewusst,</c>\n" +
                    "\n" +
                    "78\n" +
                    "00:04:14.920 --> 00:04:17.520 align:middle\n" +
                    "<c.textYellow>und trotzdem nichts dagegen</c>\n" +
                    "<c.textYellow>unternommen haben.</c>\n" +
                    "\n" +
                    "79\n" +
                    "00:04:17.560 --> 00:04:21.080 align:middle\n" +
                    "<c.textYellow>Schon länger wird Erdogan</c>\n" +
                    "<c.textYellow>auch dafür kritisiert,</c>\n" +
                    "\n" +
                    "80\n" +
                    "00:04:21.120 --> 00:04:24.000 align:middle\n" +
                    "<c.textYellow>dass er als Präsident</c>\n" +
                    "<c.textYellow>immer mächtiger wird.</c>\n" +
                    "\n" +
                    "81\n" +
                    "00:04:24.040 --> 00:04:26.240 align:middle\n" +
                    "<c.textYellow>Seine Macht nutzt er auch,</c>\n" +
                    "\n" +
                    "82\n" +
                    "00:04:26.280 --> 00:04:28.600 align:middle\n" +
                    "<c.textYellow>um politische Gegner</c>\n" +
                    "<c.textYellow>aus dem Weg zu räumen.</c>\n" +
                    "\n" +
                    "83\n" +
                    "00:04:28.640 --> 00:04:30.800 align:middle\n" +
                    "<c.textYellow>Zum Beispiel</c>\n" +
                    "<c.textYellow>mit Hilfe von Gerichten.</c>\n" +
                    "\n" +
                    "84\n" +
                    "00:04:30.840 --> 00:04:33.920 align:middle\n" +
                    "<c.textYellow>So gehen türkische Gerichte</c>\n" +
                    "<c.textYellow>immer wieder gegen Parteien</c>\n" +
                    "\n" +
                    "85\n" +
                    "00:04:33.960 --> 00:04:37.200 align:middle\n" +
                    "<c.textYellow>und Politiker vor,</c>\n" +
                    "<c.textYellow>die gegen Erdogan sind.</c>\n" +
                    "\n" +
                    "86\n" +
                    "00:04:37.240 --> 00:04:41.160 align:middle\n" +
                    "<c.textYellow>Gleichzeitig wird es</c>\n" +
                    "<c.textYellow>für Journalistinnen und Journalisten</c>\n" +
                    "\n" +
                    "87\n" +
                    "00:04:41.200 --> 00:04:45.320 align:middle\n" +
                    "<c.textYellow>immer schwieriger, kritisch</c>\n" +
                    "<c.textYellow>über den Präsidenten zu berichten.</c>\n" +
                    "\n" +
                    "88\n" +
                    "00:04:45.360 --> 00:04:47.920 align:middle\n" +
                    "<c.textYellow>Die wenigen, die das noch tun,</c>\n" +
                    "<c.textYellow>müssen fürchten,</c>\n" +
                    "\n" +
                    "89\n" +
                    "00:04:47.960 --> 00:04:49.720 align:middle\n" +
                    "<c.textYellow>deswegen bestraft zu werden.</c>\n" +
                    "\n" +
                    "90\n" +
                    "00:04:49.760 --> 00:04:54.200 align:middle\n" +
                    "<c.textYellow>Einige Journalisten sitzen</c>\n" +
                    "<c.textYellow>in der Türkei auch im Gefängnis.</c>\n" +
                    "\n" +
                    "91\n" +
                    "00:04:54.240 --> 00:04:58.080 align:middle\n" +
                    "<c.textWhite>Es gibt aber auch viele Menschen</c>\n" +
                    "<c.textWhite>in der Türkei</c>\n" +
                    "\n" +
                    "92\n" +
                    "00:04:58.120 --> 00:05:00.760 align:middle\n" +
                    "<c.textWhite>und auch in Deutschland,</c>\n" +
                    "<c.textWhite>die Erdogan gut finden</c>\n" +
                    "\n" +
                    "93\n" +
                    "00:05:00.800 --> 00:05:02.280 align:middle\n" +
                    "<c.textWhite>und ihn wählen werden.</c>\n" +
                    "\n" +
                    "94\n" +
                    "00:05:02.320 --> 00:05:04.480 align:middle\n" +
                    "<c.textWhite>Warum das so ist,</c>\n" +
                    "<c.textWhite>erfahrt ihr auf logo.de</c>\n" +
                    "\n" +
                    "95\n" +
                    "00:05:04.520 --> 00:05:07.440 align:middle\n" +
                    "<c.textWhite>Wann gewinnt man im Sport</c>\n" +
                    "<c.textWhite>'ne Auszeichnung?</c>\n" +
                    "\n" +
                    "96\n" +
                    "00:05:07.480 --> 00:05:10.400 align:middle\n" +
                    "<c.textWhite>Na, wenn man alles gibt,</c>\n" +
                    "<c.textWhite>ehrgeizig ist, zu den besten,</c>\n" +
                    "\n" +
                    "97\n" +
                    "00:05:10.440 --> 00:05:13.120 align:middle\n" +
                    "<c.textWhite>schnellsten, stärksten gehört,</c>\n" +
                    "<c.textWhite>die Wettkämpfe rockt</c>\n" +
                    "\n" +
                    "98\n" +
                    "00:05:13.160 --> 00:05:15.720 align:middle\n" +
                    "<c.textWhite>und die Konkurrenz</c>\n" +
                    "<c.textWhite>gnadenlos hinter sich lässt.</c>\n" +
                    "\n" +
                    "99\n" +
                    "00:05:15.760 --> 00:05:17.400 align:middle\n" +
                    "<c.textWhite>Ist doch klar, oder?</c>\n" +
                    "\n" +
                    "100\n" +
                    "00:05:17.440 --> 00:05:19.000 align:middle\n" +
                    "<c.textWhite>Ja, das ist eine Möglichkeit.</c>\n" +
                    "\n" +
                    "101\n" +
                    "00:05:19.040 --> 00:05:20.760 align:middle\n" +
                    "<c.textWhite>Aber es gibt noch 'ne andere.</c>\n" +
                    "\n" +
                    "102\n" +
                    "00:05:20.800 --> 00:05:24.240 align:middle\n" +
                    "<c.textWhite>So 'nen Preis hat der Leichtathlet</c>\n" +
                    "<c.textWhite>Niklas Kaul jetzt bekommen.</c>\n" +
                    "\n" +
                    "103\n" +
                    "00:05:24.280 --> 00:05:29.160 align:middle\n" +
                    "<c.textWhite>Der ist nämlich ein echter Ehrenmann</c>\n" +
                    "<c.textWhite>und sowas wird auch ausgezeichnet.</c>\n" +
                    "\n" +
                    "104\n" +
                    "00:05:29.200 --> 00:05:31.080 align:middle\n" +
                    "<c.textYellow>Stimmt Linda.</c>\n" +
                    "\n" +
                    "105\n" +
                    "00:05:31.120 --> 00:05:34.600 align:middle\n" +
                    "<c.textYellow>Diesen Preis gewinnt man nämlich</c>\n" +
                    "<c.textYellow>für das sogenannte \"Fair-Play\".</c>\n" +
                    "\n" +
                    "106\n" +
                    "00:05:34.640 --> 00:05:38.400 align:middle\n" +
                    "<c.textYellow>Das bedeutet,</c>\n" +
                    "<c.textYellow>dass man ehrlich und freundlich ist.</c>\n" +
                    "\n" +
                    "107\n" +
                    "00:05:38.440 --> 00:05:41.760 align:middle\n" +
                    "<c.textYellow>Auch, wenn man beim Sport</c>\n" +
                    "<c.textYellow>ja eigentlich gegeneinander antritt.</c>\n" +
                    "\n" +
                    "108\n" +
                    "00:05:41.800 --> 00:05:45.760 align:middle\n" +
                    "<c.textYellow>Wer Fair-Play spielt schummelt nicht</c>\n" +
                    "<c.textYellow>und hält sich an die Regeln.</c>\n" +
                    "\n" +
                    "109\n" +
                    "00:05:45.800 --> 00:05:48.720 align:middle\n" +
                    "<c.textYellow>Und: Man zeigt Respekt</c>\n" +
                    "<c.textYellow>gegenüber den anderen.</c>\n" +
                    "\n" +
                    "110\n" +
                    "00:05:48.760 --> 00:05:51.840 align:middle\n" +
                    "<c.textYellow>Man lacht sie also nicht aus</c>\n" +
                    "<c.textYellow>wenn sie verloren haben,</c>\n" +
                    "\n" +
                    "111\n" +
                    "00:05:51.880 --> 00:05:56.240 align:middle\n" +
                    "<c.textYellow>sondern ermutigt sie weiterzumachen</c>\n" +
                    "<c.textYellow>und ihr Bestes zu geben.</c>\n" +
                    "\n" +
                    "112\n" +
                    "00:05:56.280 --> 00:05:58.800 align:middle\n" +
                    "<c.textYellow>Und genau das haben</c>\n" +
                    "<c.textYellow>Niklas Kaul aus Deutschland</c>\n" +
                    "\n" +
                    "113\n" +
                    "00:05:58.840 --> 00:06:01.920 align:middle\n" +
                    "<c.textYellow>und sein sportlicher Gegner</c>\n" +
                    "<c.textYellow>Simon Ehammer aus der Schweiz</c>\n" +
                    "\n" +
                    "114\n" +
                    "00:06:01.960 --> 00:06:03.520 align:middle\n" +
                    "<c.textYellow>immer wieder gemacht.</c>\n" +
                    "\n" +
                    "115\n" +
                    "00:06:03.560 --> 00:06:05.600 align:middle\n" +
                    "<c.textYellow>Dafür gab's jetzt</c>\n" +
                    "<c.textYellow>den Fair-Play-Preis.</c>\n" +
                    "\n" +
                    "116\n" +
                    "00:06:05.640 --> 00:06:08.160 align:middle\n" +
                    "<c.textCyan>Für mich bedeutet es ganz ganz viel,</c>\n" +
                    "\n" +
                    "117\n" +
                    "00:06:08.200 --> 00:06:11.120 align:middle\n" +
                    "<c.textCyan>weil es eigentlich eine Ehrung</c>\n" +
                    "<c.textCyan>für meine Sportart ist.</c>\n" +
                    "\n" +
                    "118\n" +
                    "00:06:11.160 --> 00:06:14.960 align:middle\n" +
                    "<c.textCyan>Weil es etwas ist,</c>\n" +
                    "<c.textCyan>was mir vorgelebt wurde im Zehnkampf</c>\n" +
                    "\n" +
                    "119\n" +
                    "00:06:15.000 --> 00:06:20.240 align:middle\n" +
                    "<c.textCyan>und was ich gerne der nächsten</c>\n" +
                    "<c.textCyan>Generation auch vorleben würde.</c>\n" +
                    "\n" +
                    "120\n" +
                    "00:06:20.280 --> 00:06:23.040 align:middle\n" +
                    "<c.textYellow>Die beiden Sportler</c>\n" +
                    "<c.textYellow>sind richtige Vorbilder.</c>\n" +
                    "\n" +
                    "121\n" +
                    "00:06:23.080 --> 00:06:26.280 align:middle\n" +
                    "<c.textYellow>Denn eins ist ja klar:</c>\n" +
                    "<c.textYellow>Wenn alle so fair sind wie die Zwei,</c>\n" +
                    "\n" +
                    "122\n" +
                    "00:06:26.320 --> 00:06:29.400 align:middle\n" +
                    "<c.textYellow>dann macht Sport gleich</c>\n" +
                    "<c.textYellow>viel mehr Spaß.</c>\n" +
                    "\n" +
                    "123\n" +
                    "00:06:34.440 --> 00:06:37.440 align:middle\n" +
                    "<c.textYellow>Also so einen Gast haben wir</c>\n" +
                    "<c.textYellow>ja auch noch nicht gesehen.</c>\n" +
                    "\n" +
                    "124\n" +
                    "00:06:37.480 --> 00:06:44.280 align:middle\n" +
                    "<c.textYellow>Ganz gemütlich schlendert</c>\n" +
                    "<c.textYellow>dieser Elch in ein Kino in den USA.</c>\n" +
                    "\n" +
                    "125\n" +
                    "00:06:44.320 --> 00:06:46.840 align:middle\n" +
                    "<c.textYellow>Hmmm, welchen Film</c>\n" +
                    "<c.textYellow>der wohl gucken will?</c>\n" +
                    "\n" +
                    "126\n" +
                    "00:06:46.880 --> 00:06:50.960 align:middle\n" +
                    "<c.textYellow>Ah, ne, moment, die Filme</c>\n" +
                    "<c.textYellow>interessieren ihn gar nicht.</c>\n" +
                    "\n" +
                    "127\n" +
                    "00:06:51.000 --> 00:06:54.520 align:middle\n" +
                    "<c.textYellow>Der will nur ans Popcorn?!</c>\n" +
                    "\n" +
                    "128\n" +
                    "00:06:54.560 --> 00:06:57.600 align:middle\n" +
                    "<c.textYellow>Und das, ohne zu bezahlen,</c>\n" +
                    "<c.textYellow>ganz schön frech.</c>\n" +
                    "\n" +
                    "129\n" +
                    "00:06:57.640 --> 00:07:00.520 align:middle\n" +
                    "<c.textYellow>Danach geht der Elch einfach wieder.</c>\n" +
                    "\n" +
                    "130\n" +
                    "00:07:00.560 --> 00:07:03.120 align:middle\n" +
                    "<c.textYellow>Ob er lieber süßes</c>\n" +
                    "<c.textYellow>oder salziges Popcorn mag?</c>\n" +
                    "\n" +
                    "131\n" +
                    "00:07:03.160 --> 00:07:07.080 align:middle\n" +
                    "<c.textYellow>Tja, das werden wir wohl</c>\n" +
                    "<c.textYellow>nie erfahren.</c>\n" +
                    "\n" +
                    "132\n" +
                    "00:07:07.120 --> 00:07:13.280 align:middle\n" +
                    "<c.textWhite>Ich mag übrigens lieber süßes,</c>\n" +
                    "<c.textWhite>falls es jemanden interessiert.</c>\n" +
                    "\n" +
                    "133\n" +
                    "00:07:13.320 --> 00:07:14.800 align:middle\n" +
                    "<c.textWhite>So, wir sind am Ende.</c>\n" +
                    "\n" +
                    "134\n" +
                    "00:07:14.840 --> 00:07:18.560 align:middle\n" +
                    "<c.textWhite>Morgen ist Tim für euch hier,</c>\n" +
                    "<c.textWhite>viel Spaß und bis bald, ihr Lieben.</c>\n" +
                    "\n" +
                    "135\n" +
                    "00:07:18.600 --> 00:07:20.640 align:middle\n" +
                    "<c.textYellow>Morgen zeigt sich im Westen</c>\n" +
                    "\n" +
                    "136\n" +
                    "00:07:20.680 --> 00:07:23.760 align:middle\n" +
                    "<c.textYellow>und vor allem im Norden Deutschlands</c>\n" +
                    "<c.textYellow>wieder die Sonne.</c>\n" +
                    "\n" +
                    "137\n" +
                    "00:07:23.800 --> 00:07:26.000 align:middle\n" +
                    "<c.textYellow>Im Osten bleibt es</c>\n" +
                    "<c.textYellow>bedeckt und regnerisch.</c>\n" +
                    "\n" +
                    "138\n" +
                    "00:07:26.040 --> 00:07:30.000 align:middle\n" +
                    "<c.textYellow>Die Temperaturen steigen</c>\n" +
                    "<c.textYellow>auf maximal 11 bis 20 Grad.</c>\n" +
                    "\n" +
                    "139\n" +
                    "00:07:30.040 --> 00:07:33.240 align:middle\n" +
                    "<c.textCyan>Gratis Popcorn für alle -</c>\n" +
                    "<c.textCyan>dafür kämpfe ich -</c>\n" +
                    "\n" +
                    "140\n" +
                    "00:07:33.280 --> 00:07:37.240 align:middle\n" +
                    "<c.textCyan>und damit geht der nächste</c>\n" +
                    "<c.textCyan>Fairnesspreis an mich.</c>\n";
            String o = input.replaceAll("<c.textWhite>", "");

            o = o.replaceAll("<c.textYellow>", "");
            o = o.replaceAll("<c.textCyan>", "");
            o = o.replaceAll("</c>", "");
            o = o.replaceAll("align:middle", "");
            o = o.replaceAll("\\d", "");
            o = o.replaceAll("::. --> ::. ", "");
            o = o.replaceAll("\n", "");
            o = o.replaceAll("WEBVVT", "");
            // Use results...
            System.out.println(o);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}