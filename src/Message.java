import java.awt.desktop.SystemEventListener;

public class Message {

    public static String welcome = Board.ANSI_CYAN+ "\n" +
            "          _______  _        _______  _______  _______  _______ \n" +
            "|\\     /|(  ____ \\( \\      (  ____ \\(  ___  )(       )(  ____ \\\n" +
            "| )   ( || (    \\/| (      | (    \\/| (   ) || () () || (    \\/\n" + Board.ANSI_RESET+Board.ANSI_GREEN+
            "| | _ | || (__    | |      | |      | |   | || || || || (__    \n" +
            "| |( )| ||  __)   | |      | |      | |   | || |(_)| ||  __)   \n" +Board.ANSI_RESET+Board.ANSI_RED+
            "| || || || (      | |      | |      | |   | || |   | || (      \n" +
            "| () () || (____/\\| (____/\\| (____/\\| (___) || )   ( || (____/\\\n" +Board.ANSI_RESET+Board.ANSI_PURPLE+
            "(_______)(_______/(_______/(_______/(_______)|/     \\|(_______/"+Board.ANSI_RESET;

    public static String hero =Board.ANSI_CYAN+ "    =.                            .=    \n" +
            "    =:                            :=    \n" +
            "    =:                            :=    \n" +
            "   .=:          .:-==-:           :=.   \n" +
            "   ==.        :+########-.        .==   \n" +
            "   ==-       =#####=+###*=:       -==   \n" +
            "    ++-::. :=#####* .#####=-: .::-++    \n" +
            "     .=+=-**######-..+######**-=+=.     \n" +
            "        -**+##****-::=*++++*+**-        \n" +
            "          .**###***********+=:          \n" +
            "          .+#*+++++=-=====+#+:          \n" +
            "          :*+-  .:*+=#-.  :*+-          \n" +
            "          -#.**+==++=+===**:*=          \n" +
            "          =#. .::--===-::.  #+          \n" +
            "          =#:               #*          \n" +
            "          +#:              .#*          \n" +
            "           :                :.          "+Board.ANSI_RESET;


    public static String vs = "\n" +
            "\t\t          _______ \n" +
            "\t\t|\\     /|(  ____ \\\n" +
            "\t\t| )   ( || (    \\/\n" +
            "\t\t| |   | || (_____ \n" +
            "\t\t( (   ) )(_____  )\n" +
            "\t\t \\ \\_/ /       ) |\n" +
            "\t\t  \\   /  /\\____) |\n" +
            "\t\t   \\_/   \\_______)";


   public static String monster = Board.ANSI_RED+ "\n" +
           "                                        \n" +
           "                                        \n" +
           "         . =:..                         \n" +
           "        =@%@%+--.  :**@@@#=             \n" +
           "       *#@@@@@*:    .@@@@@@@=           \n" +
           "      .%@@@%@@@=-    @@@@@@@@%.         \n" +
           "      #@%- -@@@#:   .@@@@@@@@@@-        \n" +
           "          +@@@*+    #@@@@@@@@@@@=       \n" +
           "       .+@@@@%-   :#@@@@@@@@@@@@@=      \n" +
           "      *@@@@@@+=+*%@@@@@@@@@@@@@@@@-     \n" +
           "     +@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:    \n" +
           "     +@@@@@@@@@@+=++#*:#@@@@@@@@@@@@.   \n" +
           "      %@@@@@@@@*+:- :.-=.*@@@@@@@@@@#   \n" +
           "       #@@@@@@@@@@%+.    *#=+%@@*::+@:  \n" +
           "       :@@#=%@@@@@@@@+:.-.    *@    #=  \n" +
           "       :@%. +@@@@@@@@@#=      =*    #   \n" +
           "     --#%--:.+@@@@@*-=%@%*-:.      .    \n" +
           "    :%%*=@@%%%%%%%%#-  .-+#%@##+=-:     \n" +
           "                                      "+Board.ANSI_RESET;

   public static String demon1 =  Board.ANSI_RED+"              ,   .-'\"'=;_  ,\n" +
           "              |\\.'-~`-.`-`;/|\n" +
           "              \\.` '.'~-.` './\n" +
           "              (\\`,__=-'__,'/)\n" +
           "           _.-'-.( d\\_/b ).-'-._\n" +
           "         /'.-'   ' .---. '   '-.`\\\n" +
           "       /'  .' (=    (_)    =) '.  `\\\n" +
           "      /'  .',  `-.__.-.__.-'  ,'.  `\\\n" +
           "     (     .'.   V       V  ; '.     )\n" +
           "     (    |::  `-,__.-.__,-'  ::|    )\n" +
           "     |   /|`:.               .:'|\\   |\n" +
           "     |  / | `:.              :' |`\\  |\n" +
           "     | |  (  :.             .:  )  | |\n" +
           "     | |   ( `:.            :' )   | |\n" +
           "     | |    \\ :.           .: /    | |\n" +
           "     | |     \\`:.         .:'/     | |\n" +
           "     ) (      `\\`:.     .:'/'      ) (\n" +
           "     (  `)_     ) `:._.:' (     _(`  )\n" +
           "     \\  ' _)  .'           `.  (_ `  /\n" +
           "      \\  '_) /   .'\"```\"'.   \\ (_`  /\n" +
           "       `'\"`  \\  (         )  /  `\"'`\n" +
           "   ___   aac  `.`.       .'.'        ___\n" +
           " .`   ``\"\"\"'''--`_)     (_'--'''\"\"\"``   `.\n" +
           "(_(_(___...--'\"'`         `'\"'--...___)_)_)"+Board.ANSI_RESET;

   public static String demon2 = Board.ANSI_PURPLE+"                            ,-.\n" +
           "       ___,---.__          /'|`\\          __,---,___\n" +
           "    ,-'    \\`    `-.____,-'  |  `-.____,-'    //    `-.\n" +
           "  ,'        |           ~'\\     /`~           |        `.\n" +
           " /      ___//              `. ,'          ,  , \\___      \\\n" +
           "|    ,-'   `-.__   _         |        ,    __,-'   `-.    |\n" +
           "|   /          /\\_  `   .    |    ,      _/\\          \\   |\n" +
           "\\  |           \\ \\`-.___ \\   |   / ___,-'/ /           |  /\n" +
           " \\  \\           | `._   `\\\\  |  //'   _,' |           /  /\n" +
           "  `-.\\         /'  _ `---'' , . ``---' _  `\\         /,-'\n" +
           "     ``       /     \\    ,='/ \\`=.    /     \\       ''\n" +
           "             |__   /|\\_,--.,-.--,--._/|\\   __|\n" +
           "             /  `./  \\\\`\\ |  |  | /,//' \\,'  \\\n" +
           "           /   /     ||--+--|--+-/-|     \\   \\\n" +
           "           |   |     /'\\_\\_\\ | /_/_/`\\     |   |\n" +
           "            \\   \\__, \\_     `~'     _/ .__/   /\n" +
           "             `-._,-'   `-._______,-'   `-._,-'" + Board.ANSI_RESET;

   public static String fight = "                                                           \n" +
           Board.ANSI_CYAN+ "                    =##-                                    \n" +
           "            -=**=. .@@@+                                    \n" +
           "           *@@@@@% +@@:                                     \n" +
           "           *@@@@@#*@*:                                      \n" +
           "            %@@@@@@@+-      "+Board.ANSI_RESET+Board.ANSI_RED+"    :#@@@#-                     \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "          -*@@@@@@@@@@*:     "+Board.ANSI_RESET+Board.ANSI_RED+"    +@@@@@#                     \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "          @@@@@@@@@@@@@@%*+-.  "+Board.ANSI_RESET+Board.ANSI_RED+"  +@@@@@=                     \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "          =@@@@@@@@@%@@==*%@"+Board.ANSI_RESET+Board.ANSI_RED+" @@%@@@@@@@@#=                   \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "           :%@@@@@@@+:@@%*  "+Board.ANSI_RESET+Board.ANSI_RED+"  ::::+@@@@@@@%.                 \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "            .@@@@@@@+.@@@@:  "+Board.ANSI_RESET+Board.ANSI_RED+"   .*%@@@@@@@@#                 \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "             #@@@@@@% .--:  "+Board.ANSI_RESET+Board.ANSI_RED+"    +@@@@@@@@@@@*                \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "             *@@@@@@@%=    "+Board.ANSI_RESET+Board.ANSI_RED+"      :-=#@@@@@@@@+               \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "            =@@@@@@@@@@@=     "+Board.ANSI_RESET+Board.ANSI_RED+"        .%@@@@@@=              \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "            @@@@@@@@@@@@@=    "+Board.ANSI_RESET+Board.ANSI_RED+"         *@@@@@@@*             \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "           =@@@@@@@@@@@@@@:  "+Board.ANSI_RESET+Board.ANSI_RED+"      .-*%@@@@@@@@@+            \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "           %@@@@@@@+@@@@%-. "+Board.ANSI_RESET+Board.ANSI_RED+"     :*@@@@@@@@@@@@@@*           \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "          +@@@%%@@#  =@@@:   "+Board.ANSI_RESET+Board.ANSI_RED+"  =%@@@@@@@#+=*@@@@@@=          \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "         -@@@:        :@@%  "+Board.ANSI_RESET+Board.ANSI_RED+"  .@@@*-..:     .=*%@@@*:        \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "       -%@@+.          *@@* "+Board.ANSI_RESET+Board.ANSI_RED+"  .@@@=             .+@@@#=      \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "      =@@#.             +@@:"+Board.ANSI_RESET+Board.ANSI_RED+"  =@@@.                -#@@%-    \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "     =@%-                =@@:"+Board.ANSI_RESET+Board.ANSI_RED+" *@@=                   :*@@*   \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "    *@@:                 :@@@"+Board.ANSI_RESET+Board.ANSI_RED+" @@@                       +@%: \n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "   +@@:                 .+@@"+Board.ANSI_RESET+Board.ANSI_RED+" @@@@                        *%%.\n" +Board.ANSI_RESET+Board.ANSI_CYAN+
           "  .%%+                  .===="+Board.ANSI_RESET+Board.ANSI_RED+" ===                            "+Board.ANSI_RESET;


   public static String win = Board.ANSI_CYAN+ "                                        \n" +
           "                                        \n" +
           "                      .-==+=:           \n" +
           "                    .++-:::-**          \n" +
           "                   :#-::::::+#          \n" +
           "                   *+:::::-+#:          \n" +
           "                   %-::::-#+.           \n" +
           "             .::::+#:::::#=             \n" +
           "          .+*+=====:::::-%:             \n" +
           "          #=::::-+=+=-:::%=             \n" +
           "         .%-:::::::-=#=::+#+*:          \n" +
           "         :%*-::::::::+*::-=:=%.         \n" +
           "         =%-+++=====*+-::::::%-         \n" +
           "         =#*=:--===-+=:::::::%:         \n" +
           "         -%==+=====+*-::::::=#          \n" +
           "          #+++==--=+=::-*-:-#:          \n" +
           "          .*+======*-=*##+**.           \n" +
           "            .-====-==-. .:.             \n" +
           "                                        \n" +
           "                                          " + Board.ANSI_RESET;

   public static String fail = Board.ANSI_RED + "                                        \n" +
           "                 .:--:.                 \n" +
           "              =#%%%%%%%%#=              \n" +
           "            .%%%%%%%%%%%%%%.            \n" +
           "            -%%%%%%%%%%%%%%-            \n" +
           "             #%+=-+%%+-=+%#             \n" +
           "             #%:..=##=:.:%#             \n" +
           "             =##%%%::%%%##=             \n" +
           "               +##%%%%#%+               \n" +
           "       .%%#=    +%%%%%%+    =#%%        \n" +
           "       -%%%%%#*=::====::=+#%%%%%-       \n" +
           "            .:-+#%#**#%#+-:.            \n" +
           "        -+--=*#%#+=::=+#%#*=--+-        \n" +
           "        #%%*=-.          .-=*%%#        \n" +
           "       =%%:                  :%%-       \n" +
           "                                        "+Board.ANSI_RESET;


    public static void main(String[] args) {
        System.out.println(welcome);
        System.out.println(hero);
        System.out.println(fight);
        System.out.println(demon1);
        System.out.println(demon2);
        System.out.println(fail);
        System.out.println(win);

    }
}
