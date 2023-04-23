package eu.ansquare.regexsubtitle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "WEBVTT\n" +
                "\n" +
                "1\n" +
                "00:00:06.480 --> 00:00:10.160 align:middle\n" +
                "<c.textWhite>Das Wichtigste vorab: Es ist Freitag,</c>\n" +
                "<c.textWhite>ihr guckt gerade \"logo!\".</c>\n" +
                "\n" +
                "2\n" +
                "00:00:10.280 --> 00:00:12.880 align:middle\n" +
                "<c.textWhite>Ich bin Sherif</c>\n" +
                "<c.textWhite>und das sind unsere Themen heute:</c>\n" +
                "\n" +
                "3\n" +
                "00:00:15.560 --> 00:00:17.280 align:middle\n" +
                "<c.textWhite>Diese drei Frauen sorgen dafür,</c>\n" +
                "\n" +
                "4\n" +
                "00:00:17.360 --> 00:00:19.880 align:middle\n" +
                "<c.textWhite>dass die Schüler</c>\n" +
                "<c.textWhite>hier ein Frühstück bekommen</c>\n" +
                "\n" +
                "5\n" +
                "00:00:21.640 --> 00:00:24.720 align:middle\n" +
                "<c.textWhite>Warum haben die einen braune</c>\n" +
                "<c.textWhite>und die anderen blaue Augen,</c>\n" +
                "\n" +
                "6\n" +
                "00:00:24.880 --> 00:00:26.480 align:middle\n" +
                "<c.textWhite>wir klären wieso.</c>\n" +
                "\n" +
                "7\n" +
                "00:00:26.640 --> 00:00:28.200 align:middle\n" +
                "<c.textWhite>Und:</c>\n" +
                "\n" +
                "8\n" +
                "00:00:28.680 --> 00:00:33.080 align:middle\n" +
                "<c.textWhite>Diese Gorilladame aus dem Berliner</c>\n" +
                "<c.textWhite>Zoo ist stolze 66 Jahre alt geworden</c>\n" +
                "\n" +
                "9\n" +
                "00:00:35.240 --> 00:00:36.840 align:middle\n" +
                "<c.textWhite>Hallo bei \"logo!\".</c>\n" +
                "\n" +
                "10\n" +
                "00:00:36.920 --> 00:00:40.320 align:middle\n" +
                "<c.textWhite>Um diese Uhrzeit denken</c>\n" +
                "<c.textWhite>wahrscheinlich die Wenigsten von euch</c>\n" +
                "\n" +
                "11\n" +
                "00:00:40.520 --> 00:00:44.280 align:middle\n" +
                "<c.textWhite>an Frühstück, aber spätestens</c>\n" +
                "<c.textWhite>morgen früh ist es wieder soweit</c>\n" +
                "\n" +
                "12\n" +
                "00:00:44.440 --> 00:00:46.480 align:middle\n" +
                "<c.textWhite>und der Magen ruft nach Essen.</c>\n" +
                "\n" +
                "13\n" +
                "00:00:47.320 --> 00:00:51.120 align:middle\n" +
                "<c.textWhite>Macht ja auch Sinn, mit leerem Magen</c>\n" +
                "<c.textWhite>funktioniert das Gehirn ja gefühlt</c>\n" +
                "\n" +
                "14\n" +
                "00:00:51.240 --> 00:00:52.800 align:middle\n" +
                "<c.textWhite>nur halb so gut.</c>\n" +
                "\n" +
                "15\n" +
                "00:00:52.920 --> 00:00:55.800 align:middle\n" +
                "<c.textWhite>Allerdings gibt es in Deutschland</c>\n" +
                "<c.textWhite>immer mehr Kinder,</c>\n" +
                "\n" +
                "16\n" +
                "00:00:55.920 --> 00:00:58.560 align:middle\n" +
                "<c.textWhite>die auf ein gesundes Frühstück</c>\n" +
                "<c.textWhite>verzichten müssen,</c>\n" +
                "\n" +
                "17\n" +
                "00:00:58.680 --> 00:01:00.720 align:middle\n" +
                "<c.textWhite>weil sie das zu Hause nicht bekommen.</c>\n" +
                "\n" +
                "18\n" +
                "00:01:00.800 --> 00:01:03.480 align:middle\n" +
                "<c.textWhite>Der Verein Brot-Zeit</c>\n" +
                "<c.textWhite>kümmert sich deswegen darum,</c>\n" +
                "\n" +
                "19\n" +
                "00:01:03.600 --> 00:01:06.720 align:middle\n" +
                "<c.textWhite>dass Kinder in Schulen</c>\n" +
                "<c.textWhite>ein kostenloses Frühstück bekommen.</c>\n" +
                "\n" +
                "20\n" +
                "00:01:06.840 --> 00:01:10.240 align:middle\n" +
                "<c.textYellow>Sechs Uhr morgens und diese drei</c>\n" +
                "<c.textYellow>sind auf dem Weg in eine Schule</c>\n" +
                "\n" +
                "21\n" +
                "00:01:10.360 --> 00:01:11.920 align:middle\n" +
                "<c.textYellow>in Dresden.</c>\n" +
                "\n" +
                "22\n" +
                "00:01:12.040 --> 00:01:14.720 align:middle\n" +
                "<c.textYellow>Nee, die müssen nicht</c>\n" +
                "<c.textYellow>die dritte Klasse nachholen,</c>\n" +
                "\n" +
                "23\n" +
                "00:01:14.840 --> 00:01:16.920 align:middle\n" +
                "<c.textYellow>sie sind hier,</c>\n" +
                "<c.textYellow>um Essen vorzubereiten.</c>\n" +
                "\n" +
                "24\n" +
                "00:01:17.040 --> 00:01:20.800 align:middle\n" +
                "<c.textYellow>Martina, Monika und Gerlinde ver-</c>\n" +
                "<c.textYellow>sorgen die Schülerinnen und Schüler</c>\n" +
                "\n" +
                "25\n" +
                "00:01:20.920 --> 00:01:22.440 align:middle\n" +
                "<c.textYellow>mit Frühstück.</c>\n" +
                "\n" +
                "26\n" +
                "00:01:22.560 --> 00:01:24.960 align:middle\n" +
                "<c.textYellow>Ein ganzes Buffet</c>\n" +
                "<c.textYellow>mit richtig Auswahl gibt es.</c>\n" +
                "\n" +
                "27\n" +
                "00:01:25.080 --> 00:01:26.640 align:middle\n" +
                "<c.textCyan>Welche magste?</c>\n" +
                "<c.textCyan>- Erdbeer.</c>\n" +
                "\n" +
                "28\n" +
                "00:01:26.760 --> 00:01:28.360 align:middle\n" +
                "<c.textCyan>Erdbeer? Das hier.</c>\n" +
                "\n" +
                "29\n" +
                "00:01:28.560 --> 00:01:30.600 align:middle\n" +
                "<c.textYellow>Das finden die Kinder echt gut.</c>\n" +
                "\n" +
                "30\n" +
                "00:01:31.760 --> 00:01:36.080 align:middle\n" +
                "<c.textCyan>Weil wir hier mit Freunden quatschen</c>\n" +
                "<c.textCyan>können und mit Freunden essen können</c>\n" +
                "\n" +
                "31\n" +
                "00:01:37.280 --> 00:01:40.880 align:middle\n" +
                "<c.textCyan>Meine Mama hat mich manchmal auch</c>\n" +
                "<c.textCyan>hierher zum Frühstück geschickt,</c>\n" +
                "\n" +
                "32\n" +
                "00:01:41.040 --> 00:01:47.520 align:middle\n" +
                "<c.textCyan>weil's hier mehr gibt, zum Beispiel</c>\n" +
                "<c.textCyan>was zu Trinken, Gurke oder ein Brot.</c>\n" +
                "\n" +
                "33\n" +
                "00:01:48.000 --> 00:01:50.360 align:middle\n" +
                "<c.textCyan>Weil's Spaß macht</c>\n" +
                "<c.textCyan>und weil's gefällt.</c>\n" +
                "\n" +
                "34\n" +
                "00:01:50.480 --> 00:01:53.760 align:middle\n" +
                "<c.textCyan>Und weil man da mehr Energie hat</c>\n" +
                "<c.textCyan>für den Tag.</c>\n" +
                "\n" +
                "35\n" +
                "00:01:54.600 --> 00:01:56.640 align:middle\n" +
                "<c.textYellow>Und Energie braucht man zum Lernen.</c>\n" +
                "\n" +
                "36\n" +
                "00:01:56.960 --> 00:01:59.840 align:middle\n" +
                "<c.textYellow>Deshalb ist das Frühstück</c>\n" +
                "<c.textYellow>auch ne wichtige Mahlzeit.</c>\n" +
                "\n" +
                "37\n" +
                "00:01:59.960 --> 00:02:01.960 align:middle\n" +
                "<c.textYellow>Aber nicht alle kriegen zuhause was.</c>\n" +
                "\n" +
                "38\n" +
                "00:02:02.120 --> 00:02:04.840 align:middle\n" +
                "<c.textYellow>Monika, Gerlinde und Martina</c>\n" +
                "<c.textYellow>wollen deshalb helfen,</c>\n" +
                "\n" +
                "39\n" +
                "00:02:04.960 --> 00:02:07.840 align:middle\n" +
                "<c.textYellow>dass hier auch die Kinder</c>\n" +
                "<c.textYellow>gut in den Schultag starten,</c>\n" +
                "\n" +
                "40\n" +
                "00:02:07.960 --> 00:02:09.640 align:middle\n" +
                "<c.textYellow>die mit leerem Bauch ankommen.</c>\n" +
                "\n" +
                "41\n" +
                "00:02:10.560 --> 00:02:13.120 align:middle\n" +
                "<c.textYellow>Das tun die drei Frühstücksdamen</c>\n" +
                "<c.textYellow>ohne Bezahlung.</c>\n" +
                "\n" +
                "42\n" +
                "00:02:13.280 --> 00:02:15.960 align:middle\n" +
                "<c.textYellow>Einfach, weil es ihnen wichtig ist</c>\n" +
                "<c.textYellow>und Spaß macht.</c>\n" +
                "\n" +
                "43\n" +
                "00:02:16.120 --> 00:02:17.800 align:middle\n" +
                "<c.textYellow>Und die Kinder finden's super.</c>\n" +
                "\n" +
                "44\n" +
                "00:02:18.880 --> 00:02:20.840 align:middle\n" +
                "<c.textCyan>Weil sie so nett mit uns reden.</c>\n" +
                "\n" +
                "45\n" +
                "00:02:21.520 --> 00:02:25.320 align:middle\n" +
                "<c.textYellow>Nett reden ist noch so ein prima</c>\n" +
                "<c.textYellow>Nebeneffekt, den das Frühstück hat:</c>\n" +
                "\n" +
                "46\n" +
                "00:02:25.840 --> 00:02:28.040 align:middle\n" +
                "<c.textYellow>Beim Essen quatscht sich's</c>\n" +
                "<c.textYellow>viel besser.</c>\n" +
                "\n" +
                "47\n" +
                "00:02:28.160 --> 00:02:32.040 align:middle\n" +
                "<c.textYellow>Und das schweißt Kinder</c>\n" +
                "<c.textYellow>und Frühstückshelferinnen zusammen.</c>\n" +
                "\n" +
                "48\n" +
                "00:02:33.680 --> 00:02:35.240 align:middle\n" +
                "<c.textWhite>Sehr schön.</c>\n" +
                "\n" +
                "49\n" +
                "00:02:35.440 --> 00:02:37.880 align:middle\n" +
                "<c.textWhite>Habt ihr euch schon mal gefragt,</c>\n" +
                "<c.textWhite>wie es kommt,</c>\n" +
                "\n" +
                "50\n" +
                "00:02:38.000 --> 00:02:40.600 align:middle\n" +
                "<c.textWhite>dass wir Menschen</c>\n" +
                "<c.textWhite>alle unterschiedlich aussehen?</c>\n" +
                "\n" +
                "51\n" +
                "00:02:40.720 --> 00:02:44.680 align:middle\n" +
                "<c.textWhite>Warum zum Beispiel der eine braune</c>\n" +
                "<c.textWhite>Augen hat und die andere blaue?</c>\n" +
                "\n" +
                "52\n" +
                "00:02:44.880 --> 00:02:47.920 align:middle\n" +
                "<c.textWhite>Diese Frage hat ziemlich lange</c>\n" +
                "<c.textWhite>viele Wissenschaftlerinnen</c>\n" +
                "\n" +
                "53\n" +
                "00:02:48.040 --> 00:02:51.240 align:middle\n" +
                "<c.textWhite>und Wissenschaftler beschäftigt,</c>\n" +
                "<c.textWhite>bis sie vor rund 20 Jahren,</c>\n" +
                "\n" +
                "54\n" +
                "00:02:51.360 --> 00:02:53.320 align:middle\n" +
                "<c.textWhite>endlich die Antwort gefunden haben.</c>\n" +
                "\n" +
                "55\n" +
                "00:02:53.400 --> 00:02:55.960 align:middle\n" +
                "<c.textWhite>Das Ganze hat nämlich</c>\n" +
                "<c.textWhite>mit unseren Genen zu tun,</c>\n" +
                "\n" +
                "56\n" +
                "00:02:56.080 --> 00:02:58.520 align:middle\n" +
                "<c.textWhite>das ist so etwas</c>\n" +
                "<c.textWhite>wie der menschlicher Bauplan.</c>\n" +
                "\n" +
                "57\n" +
                "00:02:58.600 --> 00:03:00.640 align:middle\n" +
                "<c.textWhite>Was es mit damit genau auf sich hat?</c>\n" +
                "\n" +
                "58\n" +
                "00:03:00.760 --> 00:03:02.320 align:middle\n" +
                "<c.textWhite>Wir erklären's euch.</c>\n" +
                "\n" +
                "59\n" +
                "00:03:02.600 --> 00:03:04.120 align:middle\n" +
                "<c.textYellow>Um zu verstehen,</c>\n" +
                "\n" +
                "60\n" +
                "00:03:04.240 --> 00:03:06.960 align:middle\n" +
                "<c.textYellow>wie die Bauanleitung</c>\n" +
                "<c.textYellow>von uns Menschen funktioniert,</c>\n" +
                "\n" +
                "61\n" +
                "00:03:07.080 --> 00:03:09.080 align:middle\n" +
                "<c.textYellow>müssen wir ganz tief</c>\n" +
                "<c.textYellow>in einen Menschen</c>\n" +
                "\n" +
                "62\n" +
                "00:03:09.160 --> 00:03:12.240 align:middle\n" +
                "<c.textYellow>und seine kleinsten Teile,</c>\n" +
                "<c.textYellow>die Zellen, hineinschauen.</c>\n" +
                "\n" +
                "63\n" +
                "00:03:12.560 --> 00:03:15.720 align:middle\n" +
                "<c.textYellow>Dieses Ding, das aussieht,</c>\n" +
                "<c.textYellow>wie eine verdrehte Strickleiter,</c>\n" +
                "\n" +
                "64\n" +
                "00:03:15.840 --> 00:03:17.400 align:middle\n" +
                "<c.textYellow>das ist die Bauanleitung.</c>\n" +
                "\n" +
                "65\n" +
                "00:03:17.520 --> 00:03:20.760 align:middle\n" +
                "<c.textYellow>Oder wie Forscherinnen</c>\n" +
                "<c.textYellow>und Forscher sagen: die DNA.</c>\n" +
                "\n" +
                "66\n" +
                "00:03:21.520 --> 00:03:24.960 align:middle\n" +
                "<c.textYellow>Dort stecken alle Infos drin,</c>\n" +
                "<c.textYellow>also zum Beispiel auch,</c>\n" +
                "\n" +
                "67\n" +
                "00:03:25.080 --> 00:03:27.840 align:middle\n" +
                "<c.textYellow>welche Haarfarbe</c>\n" +
                "<c.textYellow>oder welche Augenfarbe ihr habt.</c>\n" +
                "\n" +
                "68\n" +
                "00:03:28.800 --> 00:03:32.160 align:middle\n" +
                "<c.textYellow>Welche Infos genau dort zu finden</c>\n" +
                "<c.textYellow>sind, ist aber kein Zufall.</c>\n" +
                "\n" +
                "69\n" +
                "00:03:32.240 --> 00:03:37.120 align:middle\n" +
                "<c.textYellow>Denn euer Bauplan ist sowas wie eine</c>\n" +
                "<c.textYellow>Mischung der Baupläne eurer Eltern.</c>\n" +
                "\n" +
                "70\n" +
                "00:03:37.600 --> 00:03:40.920 align:middle\n" +
                "<c.textYellow>Wenn eure Eltern also zum Beispiel</c>\n" +
                "<c.textYellow>beide braune Haare haben,</c>\n" +
                "\n" +
                "71\n" +
                "00:03:41.040 --> 00:03:44.720 align:middle\n" +
                "<c.textYellow>ist es sehr wahrscheinlich,</c>\n" +
                "<c.textYellow>dass auch ihr braune Haare habt.</c>\n" +
                "\n" +
                "72\n" +
                "00:03:45.240 --> 00:03:48.680 align:middle\n" +
                "<c.textYellow>Wenn einer eurer Eltern</c>\n" +
                "<c.textYellow>eine Brille trägt, kann es gut sein,</c>\n" +
                "\n" +
                "73\n" +
                "00:03:48.800 --> 00:03:50.960 align:middle\n" +
                "<c.textYellow>dass auch ihr mal</c>\n" +
                "<c.textYellow>eine Brille braucht.</c>\n" +
                "\n" +
                "74\n" +
                "00:03:53.360 --> 00:03:54.960 align:middle\n" +
                "<c.textYellow>Auf der DNA sind aber auch</c>\n" +
                "\n" +
                "75\n" +
                "00:03:55.080 --> 00:03:58.000 align:middle\n" +
                "<c.textYellow>Informationen über bestimmte</c>\n" +
                "<c.textYellow>Krankheiten gespeichert.</c>\n" +
                "\n" +
                "76\n" +
                "00:03:58.120 --> 00:04:00.440 align:middle\n" +
                "<c.textYellow>Seitdem die Forschenden</c>\n" +
                "<c.textYellow>verstanden haben,</c>\n" +
                "\n" +
                "77\n" +
                "00:04:00.640 --> 00:04:03.080 align:middle\n" +
                "<c.textYellow>welche Informationen</c>\n" +
                "<c.textYellow>wo zu finden sind,</c>\n" +
                "\n" +
                "78\n" +
                "00:04:03.200 --> 00:04:07.320 align:middle\n" +
                "<c.textYellow>tüfteln sie an neuen Möglichkeiten,</c>\n" +
                "<c.textYellow>diese Krankheiten zu heilen.</c>\n" +
                "\n" +
                "79\n" +
                "00:04:08.040 --> 00:04:11.080 align:middle\n" +
                "<c.textYellow>Dazu versuchen sie,</c>\n" +
                "<c.textYellow>die Bereiche der DNA zu finden,</c>\n" +
                "\n" +
                "80\n" +
                "00:04:11.200 --> 00:04:13.000 align:middle\n" +
                "<c.textYellow>die die Krankheit auslösen.</c>\n" +
                "\n" +
                "81\n" +
                "00:04:13.480 --> 00:04:16.040 align:middle\n" +
                "<c.textYellow>Dadurch können dann zum Beispiel</c>\n" +
                "<c.textYellow>neue Medikamente</c>\n" +
                "\n" +
                "82\n" +
                "00:04:16.200 --> 00:04:18.680 align:middle\n" +
                "<c.textYellow>oder auch Behandlungen</c>\n" +
                "<c.textYellow>entwickelt werden.</c>\n" +
                "\n" +
                "83\n" +
                "00:04:20.320 --> 00:04:24.840 align:middle\n" +
                "<c.textWhite>Dass Forschende immer mehr über</c>\n" +
                "<c.textWhite>die DNA wissen, klingt erstmal super.</c>\n" +
                "\n" +
                "84\n" +
                "00:04:24.960 --> 00:04:27.400 align:middle\n" +
                "<c.textWhite>Doch viele machen sich</c>\n" +
                "<c.textWhite>deswegen auch Sorgen.</c>\n" +
                "\n" +
                "85\n" +
                "00:04:27.520 --> 00:04:29.240 align:middle\n" +
                "<c.textWhite>Wieso, weshalb, warum -</c>\n" +
                "\n" +
                "86\n" +
                "00:04:29.360 --> 00:04:32.240 align:middle\n" +
                "<c.textWhite>diese Fragen erklären wir</c>\n" +
                "<c.textWhite>Online bei uns auf logo.de.</c>\n" +
                "\n" +
                "87\n" +
                "00:04:32.400 --> 00:04:34.160 align:middle\n" +
                "<c.textWhite>Schaut da also gerne mal vorbei.</c>\n" +
                "\n" +
                "88\n" +
                "00:04:34.880 --> 00:04:38.680 align:middle\n" +
                "<c.textWhite>♪ Mit 66 Jahren,</c>\n" +
                "<c.textWhite>da fängt das Leben an.</c>\n" +
                "\n" +
                "89\n" +
                "00:04:38.840 --> 00:04:41.760 align:middle\n" +
                "<c.textWhite>Mit 66 Jahren, da hat man Spaß daran.</c>\n" +
                "\n" +
                "90\n" +
                "00:04:41.880 --> 00:04:44.800 align:middle\n" +
                "<c.textWhite>Mit 66 Jahren,</c>\n" +
                "<c.textWhite>da kommt man erst in Schuss.</c>\n" +
                "\n" +
                "91\n" +
                "00:04:44.920 --> 00:04:48.680 align:middle\n" +
                "<c.textWhite>Mit 66 ist noch lange nicht Schluss ♪</c>\n" +
                "\n" +
                "92\n" +
                "00:04:49.360 --> 00:04:51.840 align:middle\n" +
                "<c.textWhite>Okay, das Lied</c>\n" +
                "<c.textWhite>kennt ihr wahrscheinlich nicht,</c>\n" +
                "\n" +
                "93\n" +
                "00:04:51.960 --> 00:04:54.800 align:middle\n" +
                "<c.textWhite>das kenn ziemlich sicher</c>\n" +
                "<c.textWhite>nur eure Omas und Opas,</c>\n" +
                "\n" +
                "94\n" +
                "00:04:54.920 --> 00:04:58.080 align:middle\n" +
                "<c.textWhite>aber zu unserer nächsten Geschichte</c>\n" +
                "<c.textWhite>passt es einfach super,</c>\n" +
                "\n" +
                "95\n" +
                "00:04:58.200 --> 00:05:02.880 align:middle\n" +
                "<c.textWhite>denn genau dieses Alter, 66 Jahre</c>\n" +
                "<c.textWhite>hat jetzt diese Gorilladame erreicht:</c>\n" +
                "\n" +
                "96\n" +
                "00:05:03.120 --> 00:05:05.200 align:middle\n" +
                "<c.textWhite>Fatou aus dem Berliner Zoo.</c>\n" +
                "\n" +
                "97\n" +
                "00:05:05.320 --> 00:05:09.840 align:middle\n" +
                "<c.textWhite>Und dass sie so alt ist, joa,</c>\n" +
                "<c.textWhite>das ist 'ne echte Sensation.</c>\n" +
                "\n" +
                "98\n" +
                "00:05:10.760 --> 00:05:14.840 align:middle\n" +
                "<c.textYellow>Denn sehr wahrscheinlich ist sie</c>\n" +
                "<c.textYellow>damit der älteste Gorilla der Welt.</c>\n" +
                "\n" +
                "99\n" +
                "00:05:15.200 --> 00:05:18.840 align:middle\n" +
                "<c.textYellow>Aber über was freuen sich</c>\n" +
                "<c.textYellow>66-jährige Geburtstagskinder?</c>\n" +
                "\n" +
                "100\n" +
                "00:05:19.000 --> 00:05:21.840 align:middle\n" +
                "<c.textYellow>Ne Vase, Lesebrille</c>\n" +
                "<c.textYellow>oder Crosstrainer?</c>\n" +
                "\n" +
                "101\n" +
                "00:05:22.040 --> 00:05:26.320 align:middle\n" +
                "<c.textYellow>Nee, für Fatou reicht ein Riesenkorb</c>\n" +
                "<c.textYellow>mit leckeren Früchten.</c>\n" +
                "\n" +
                "102\n" +
                "00:05:27.000 --> 00:05:29.120 align:middle\n" +
                "<c.textYellow>Gorillas,</c>\n" +
                "<c.textYellow>die in freier Wildbahn leben,</c>\n" +
                "\n" +
                "103\n" +
                "00:05:29.240 --> 00:05:32.120 align:middle\n" +
                "<c.textYellow>werden übrigens meistens</c>\n" +
                "<c.textYellow>nicht älter als 40 Jahre.</c>\n" +
                "\n" +
                "104\n" +
                "00:05:32.280 --> 00:05:34.280 align:middle\n" +
                "<c.textYellow>Fatou ist 66.</c>\n" +
                "\n" +
                "105\n" +
                "00:05:34.880 --> 00:05:37.280 align:middle\n" +
                "<c.textYellow>Der Grund: Im Zoo lebt sie</c>\n" +
                "<c.textYellow>in Gefangenschaft</c>\n" +
                "\n" +
                "106\n" +
                "00:05:37.360 --> 00:05:39.600 align:middle\n" +
                "<c.textYellow>und da hat sie</c>\n" +
                "<c.textYellow>ein ganz anderes Leben.</c>\n" +
                "\n" +
                "107\n" +
                "00:05:39.960 --> 00:05:42.080 align:middle\n" +
                "<c.textCyan>Wenn altersbedingt</c>\n" +
                "<c.textCyan>alle Zähne ausfallen,</c>\n" +
                "\n" +
                "108\n" +
                "00:05:42.200 --> 00:05:45.160 align:middle\n" +
                "<c.textCyan>können wir das Futter</c>\n" +
                "<c.textCyan>zum Beispiel entsprechend kochen</c>\n" +
                "\n" +
                "109\n" +
                "00:05:45.280 --> 00:05:46.840 align:middle\n" +
                "<c.textCyan>bei Gemüsesorten.</c>\n" +
                "\n" +
                "110\n" +
                "00:05:46.920 --> 00:05:49.840 align:middle\n" +
                "<c.textCyan>Futter ist immer bestens da,</c>\n" +
                "<c.textCyan>der Tierarzt kümmert sich,</c>\n" +
                "\n" +
                "111\n" +
                "00:05:49.960 --> 00:05:53.400 align:middle\n" +
                "<c.textCyan>wenn mal so ein Tier krank ist,</c>\n" +
                "<c.textCyan>es gibt keine natürlichen Feinde.</c>\n" +
                "\n" +
                "112\n" +
                "00:05:53.560 --> 00:05:55.120 align:middle\n" +
                "<c.textCyan>Und das sind die Gründe,</c>\n" +
                "\n" +
                "113\n" +
                "00:05:55.240 --> 00:05:57.960 align:middle\n" +
                "<c.textCyan>weshalb sie so viel älter werden</c>\n" +
                "<c.textCyan>als in der Natur.</c>\n" +
                "\n" +
                "114\n" +
                "00:05:58.040 --> 00:06:01.000 align:middle\n" +
                "<c.textYellow>Dass sie mal so alt werden würde,</c>\n" +
                "<c.textYellow>ahnte 1959 niemand.</c>\n" +
                "\n" +
                "115\n" +
                "00:06:01.200 --> 00:06:05.000 align:middle\n" +
                "<c.textYellow>Damals kommt Fatou wie ein Superstar</c>\n" +
                "<c.textYellow>mit dem Flugzeug nach Berlin.</c>\n" +
                "\n" +
                "116\n" +
                "00:06:05.160 --> 00:06:07.320 align:middle\n" +
                "<c.textYellow>Geboren wurde sie wohl</c>\n" +
                "<c.textYellow>in Westafrika,</c>\n" +
                "\n" +
                "117\n" +
                "00:06:07.520 --> 00:06:10.640 align:middle\n" +
                "<c.textYellow>soll dann mit einem Matrosen</c>\n" +
                "<c.textYellow>nach Frankreich gekommen sein</c>\n" +
                "\n" +
                "118\n" +
                "00:06:10.720 --> 00:06:12.880 align:middle\n" +
                "<c.textYellow>und landete schließlich</c>\n" +
                "<c.textYellow>im Berliner Zoo.</c>\n" +
                "\n" +
                "119\n" +
                "00:06:13.080 --> 00:06:15.200 align:middle\n" +
                "<c.textYellow>Hier lebt sie meistens</c>\n" +
                "<c.textYellow>für sich alleine.</c>\n" +
                "\n" +
                "120\n" +
                "00:06:15.320 --> 00:06:18.360 align:middle\n" +
                "<c.textYellow>Die jungen Hüpfer in ihrem Gehege</c>\n" +
                "<c.textYellow>sind ihr ziemlich egal.</c>\n" +
                "\n" +
                "121\n" +
                "00:06:18.440 --> 00:06:21.640 align:middle\n" +
                "<c.textCyan>Wenn sie gut drauf ist, lässt sie</c>\n" +
                "<c.textCyan>sich ein bisschen kitzeln,</c>\n" +
                "\n" +
                "122\n" +
                "00:06:21.760 --> 00:06:23.680 align:middle\n" +
                "<c.textCyan>bisschen krabbeln, dann brummt sie.</c>\n" +
                "\n" +
                "123\n" +
                "00:06:23.800 --> 00:06:26.920 align:middle\n" +
                "<c.textCyan>Aber ist jetzt kein Tier,</c>\n" +
                "<c.textCyan>was auf Streicheleinheiten steht.</c>\n" +
                "\n" +
                "124\n" +
                "00:06:27.040 --> 00:06:29.760 align:middle\n" +
                "<c.textYellow>Naja, mit sechdundsechsig darf man ja</c>\n" +
                "<c.textYellow>auch mal seine Ruhe haben.</c>\n" +
                "\n" +
                "125\n" +
                "00:06:30.680 --> 00:06:32.280 align:middle\n" +
                "<c.textWhite>Tja, das stimmt wohl.</c>\n" +
                "\n" +
                "126\n" +
                "00:06:32.400 --> 00:06:36.920 align:middle\n" +
                "<c.textWhite>Und zum Schluss schauen wir nochmal</c>\n" +
                "<c.textWhite>kurz in Richtung Weltall,</c>\n" +
                "\n" +
                "127\n" +
                "00:06:37.200 --> 00:06:40.240 align:middle\n" +
                "<c.textWhite>heute ist nämlich eine</c>\n" +
                "<c.textWhite>neue Weltraum-Mission gestartet -</c>\n" +
                "\n" +
                "128\n" +
                "00:06:40.320 --> 00:06:42.840 align:middle\n" +
                "<c.textWhite>und zwar die Jupiter-Mission Juice.</c>\n" +
                "\n" +
                "129\n" +
                "00:06:43.560 --> 00:06:46.560 align:middle\n" +
                "<c.textWhite>Drei, zwei, eins - Lift Off.</c>\n" +
                "\n" +
                "130\n" +
                "00:06:47.080 --> 00:06:50.280 align:middle\n" +
                "<c.textWhite>Um Punkt vierzeh.vierzehn Uhr hob die Rakete ab.</c>\n" +
                "\n" +
                "131\n" +
                "00:06:50.400 --> 00:06:54.400 align:middle\n" +
                "<c.textWhite>Mit an Bord eine Sonde mit</c>\n" +
                "<c.textWhite>ganz vielen Kameras und Messgeräten,</c>\n" +
                "\n" +
                "132\n" +
                "00:06:54.520 --> 00:06:56.680 align:middle\n" +
                "<c.textWhite>die den Jupiter erforschen sollen.</c>\n" +
                "\n" +
                "133\n" +
                "00:06:57.000 --> 00:06:59.760 align:middle\n" +
                "<c.textWhite>Acht Jahre lang wird die Sonde</c>\n" +
                "<c.textWhite>jetzt unterwegs sein,</c>\n" +
                "\n" +
                "134\n" +
                "00:06:59.840 --> 00:07:01.480 align:middle\n" +
                "<c.textWhite>bis sie den Jupiter erreicht.</c>\n" +
                "\n" +
                "135\n" +
                "00:07:01.560 --> 00:07:05.200 align:middle\n" +
                "<c.textWhite>Der ganze Flug wird übrigens aus</c>\n" +
                "<c.textWhite>Deutschland überwacht und gesteuert.</c>\n" +
                "\n" +
                "136\n" +
                "00:07:05.320 --> 00:07:07.760 align:middle\n" +
                "<c.textWhite>In Darmstadt ist nämlich</c>\n" +
                "<c.textWhite>das Kontrollzentrum.</c>\n" +
                "\n" +
                "137\n" +
                "00:07:08.600 --> 00:07:12.040 align:middle\n" +
                "<c.textWhite>Beim Start heute war übrigens</c>\n" +
                "<c.textWhite>unsere Reporterin Madgalena dabei,</c>\n" +
                "\n" +
                "138\n" +
                "00:07:12.200 --> 00:07:17.040 align:middle\n" +
                "<c.textWhite>wie das war, was sie so erlebt hat,</c>\n" +
                "<c.textWhite>das seht ihr morgen Abend bei \"logo!\".</c>\n" +
                "\n" +
                "139\n" +
                "00:07:17.160 --> 00:07:19.200 align:middle\n" +
                "<c.textWhite>Denn damit wars das</c>\n" +
                "<c.textWhite>auch schon von uns.</c>\n" +
                "\n" +
                "140\n" +
                "00:07:19.960 --> 00:07:23.880 align:middle\n" +
                "<c.textWhite>Ich würd mich freuen, wenn ihr morgen</c>\n" +
                "<c.textWhite>wieder dabei seid und sag schonmal:</c>\n" +
                "\n" +
                "141\n" +
                "00:07:24.000 --> 00:07:26.040 align:middle\n" +
                "<c.textWhite>Bis morgen, machts gut und Tschüss.</c>\n" +
                "\n" +
                "142\n" +
                "00:07:26.160 --> 00:07:28.880 align:middle\n" +
                "<c.textYellow>Im Südwesten, Norden</c>\n" +
                "<c.textYellow>und später auch im Osten</c>\n" +
                "\n" +
                "143\n" +
                "00:07:28.960 --> 00:07:31.200 align:middle\n" +
                "<c.textYellow>kann es morgen manchmal</c>\n" +
                "<c.textYellow>ganz schön werden.</c>\n" +
                "\n" +
                "144\n" +
                "00:07:31.280 --> 00:07:34.320 align:middle\n" +
                "<c.textYellow>Sonst ist es eher grau,</c>\n" +
                "<c.textYellow>viele dunkle Wolken und Regen.</c>\n" +
                "\n" +
                "145\n" +
                "00:07:34.480 --> 00:07:37.000 align:middle\n" +
                "<c.textYellow>Die Höchstwerte</c>\n" +
                "<c.textYellow>liegen zwischen 7 und 15 Grad.</c>\n" +
                "\n" +
                "146\n" +
                "00:07:38.640 --> 00:07:41.040 align:middle\n" +
                "<c.textCyan>Iih, Spinatlasagne!</c>\n" +
                "\n" +
                "147\n" +
                "00:07:41.520 --> 00:07:44.480 align:middle\n" +
                "<c.textCyan>Oma, ich schenk dir doch ne Brille.</c>\n" +
                "\n" +
                "148\n" +
                "00:07:45.400 --> 00:07:47.760 align:middle\n" +
                "<c.textCyan>Ah, yam yam.</c>\n";

        String o = input.replaceAll("<c.textWhite>", "");
        o = o.replaceAll("<c.textYellow>", "");
        o = o.replaceAll("<c.textCyan>", "");
        o = o.replaceAll("</c>", "");
        o = o.replaceAll("align:middle", "");
        o = o.replaceAll("\\d", "");
        o = o.replaceAll("::. --> ::. ", "");
        o = o.replaceAll("\n", "");
        // Use results...
        System.out.println(o);
    }
}