package day21;

public class WebsiteChecker {
    public static void main(String[] args) {
        String[] web = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com",
                "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu",};
        int countCom = 0, countOrg=0, countEdu=0,others=0;


        System.out.println(web[0]);
        System.out.println(web[1]);
        System.out.println(web[web.length-1]);







        for (int i = 0; i < web.length; i++) {                                                                              // i = 0
            if (web[i].substring(web[i].indexOf(".")+1).equalsIgnoreCase("com")){                       // "bing.com".substrin()
                countCom++;
            } else if (web[i].substring(web[i].indexOf(".")+1).equalsIgnoreCase("org")) {
                countOrg++;

            } else if (web[i].substring(web[i].indexOf(".")+1).equalsIgnoreCase("edu")){
                countEdu++;

            } else {
                others++;
            }

        }
        System.out.println("Com "+countCom);
        System.out.println("Org "+countOrg);
        System.out.println("Edu "+countEdu);
        System.out.println("Others "+others);
    }
}
