package Lecture.Basic.OOP.Procedural;

public class Procedural {

    public static void main(String[] args) {
        /*
        * 절차 지향 프로그래밍
        * - 프로그램 실행 순서 흐름을 순차적으로 처리하는 방식
        * - "어떻게" 를 중심으로 프로그래밍 한다.
        * */
        boolean isActive = false;
        int volume = 0;
        MusicPlayer player = new MusicPlayer();

        // 플레이어 실행
        setMusicPlayerActive(player, "on");
//        player.isActive = true;
        System.out.println("isActive : " + player.isActive);

        // 볼륨 증가
        setVolume(player, "+");
//        player.volume++;
        System.out.println("player.volume : " + player.volume);

        // 볼륨 증가
        setVolume(player, "+");
//        player.volume++;
        System.out.println("player.volume : " + player.volume);

        // 볼륨 감소
        setVolume(player, "-");
//        player.volume--;
        System.out.println("player.volume : " + player.volume);

        // 상태 확인
        showStatus(player);
//        if (player.isActive) {
//            System.out.println("실행 상태 확인 : " + player.isActive);
//            System.out.println("player.volume : " + player.volume);
//        } else {
//            System.out.println("플레이어 실행 상태 확인 : " + player.isActive);
//        }

        // 플레이어 끄기
//        player.isActive = false;
        setMusicPlayerActive(player, "off");
        System.out.println("player.isActive : " + player.isActive);
    }


    static void setMusicPlayerActive(MusicPlayer player, String status) {
        if(status.equals("on")) player.isActive = true;
        else if(status.equals("off")) player.isActive = false;
    }

    static void setVolume(MusicPlayer player, String status) {
        if(status.equals("+")) player.volume++;
        else if (status.equals("-")) player.volume--;
    }

    static void showStatus(MusicPlayer player) {
        if (player.isActive) {
            System.out.println("실행 상태 확인 : " + player.isActive);
            System.out.println("player.volume : " + player.volume);
        } else {
            System.out.println("플레이어 실행 상태 확인 : " + player.isActive);
        }
    }
}
