package com.ohgiraffers.section04.uses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MusicMenu {
    private MusicManager musicManager = new MusicManager();
    private Scanner sc = new Scanner(System.in);



    public void mainMenu() {

        /* fileLoad() */
        musicManager.fileLoad();

        mainMenu:
        while (true) {
            System.out.println("========== 메뉴 ==========");
            System.out.println("1. 곡 추가");
            System.out.println("2. 곡 전체 조회");
            System.out.println("3. 정렬하여 조회");
            System.out.println("4. 가수명으로 검색");
            System.out.println("5. 곡명으로 검색");
            System.out.println("6. 곡 정보 수정");
            System.out.println("7. 곡 삭제");
            System.out.println("0. 프로그램 종료");


            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    addList();
                    break;
                case 2:
                    selectList();
                    break;
                case 3:
                    sortMenu();
                    break;
                case 4:
                    searchArtist();
                    break;
                case 5:
                    searchTitle();
                    break;
                case 6:
                    updateMusic();
                    break;
                case 7:
                    removeMusic();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    /* 파일 저장 */
                    musicManager.fileSave();
                    break mainMenu;
                default:
                    System.out.println("잘못 선택하셨습니다. 번호를 다시 입력해주세요.");
                    break;
            }
        }

    }

    public void addList() {
        System.out.println("===== 곡 추가 =====");
        System.out.print("가수 입력 : ");
        String artist = sc.nextLine();
        System.out.print("제목 입력 : ");
        String title = sc.nextLine();

        musicManager.addList(new MusicDTO(artist, title));
    }

    public void selectList() {
        System.out.println("===== 곡 전체 조회 =====");
        List<MusicDTO> musicList = musicManager.selectList();

        /* */
        if (!musicList.isEmpty()) {
            for (MusicDTO music : musicList) {
                System.out.println(music);
            }
        } else {
            System.out.println("목록이 존재하지 않습니다.");
        }
    }

    public void sortMenu() {
        System.out.println("===== 정렬 메뉴 =====");
        System.out.println("1. 가수명 오름차순 정렬");
        System.out.println("2. 곡명 오름차순 정렬");
        System.out.println("3. 가수명 내림차순 정렬");
        System.out.println("4. 곡명 내림차순 정렬");
        System.out.print("메뉴 선택 : ");
        int menu = sc.nextInt();

        ascDesc(menu);
    }

    public void ascDesc(int menu) {
        System.out.println("===== 정렬하여 조회 =====");
        List<MusicDTO> musicList = musicManager.selectList();

        if (musicList.isEmpty()) {
            System.out.println("목록이 존재하지 않습니다.");
            return;
        }

        /* 정렬 시 원본 데이터를 변경하므로 사본 데이터를 별도로 생성한다. */
        List<MusicDTO> sortList = new ArrayList<>();
        sortList.addAll(musicList);

        if (menu == 1) {
            /* 익명 클래스를 사용할 수도 있다. */
            sortList.sort(new Comparator<MusicDTO>() {

                @Override
                public int compare(MusicDTO o1, MusicDTO o2) {
                    return o1.getArtist().compareTo(o2.getArtist());
                }

            });
        } else if (menu == 2) {
            /* Comparator를 상속한 클래스를 사용할 수도 있다. */
            sortList.sort(new AscTitle());
        } else if (menu == 3) {
            sortList.sort(new DescArtist());
        } else {
            sortList.sort(new DescTitle());
        }

        for (int i = 0; i < sortList.size(); i++) {
            System.out.println(sortList.get(i));
        }
    }


    public void searchArtist() {
        System.out.println("===== 가수명으로 검색 =====");
        System.out.print("가수명 입력 : ");
        List<MusicDTO> searchList = musicManager.searchArtist(sc.nextLine());

        if (!searchList.isEmpty()) {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void searchTitle() {
        System.out.println("===== 곡명으로 검색 =====");
        System.out.print("곡명 입력 : ");
        List<MusicDTO> searchList = musicManager.searchTitle(sc.nextLine());

        if (!searchList.isEmpty()) {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }


    public void updateMusic() {
        System.out.println("===== 곡 정보 수정 =====");
        System.out.print("수정할 곡의 id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("수정할 가수명 : ");
        String updateArtist = sc.nextLine();
        System.out.print("수정할 제목명 : ");
        String updateTitle = sc.nextLine();

        MusicDTO updateMusic = new MusicDTO(id, updateArtist, updateTitle);

        if (musicManager.updateMusic(updateMusic)) {
            System.out.println("성공적으로 수정되었습니다.");
        } else {
            System.out.println("수정할 곡을 찾지 못했습니다.");
        }
    }

    public void removeMusic() {
        System.out.println("===== 곡 삭제 =====");
        System.out.print("삭제할 곡의 id : ");
        if (musicManager.removeMusic(sc.nextInt())) {
            System.out.println("성공적으로 삭제 되었습니다.");
        } else {
            System.out.println("삭제할 곡을 찾지 못했습니다.");
        }
        sc.nextLine();
    }

}


