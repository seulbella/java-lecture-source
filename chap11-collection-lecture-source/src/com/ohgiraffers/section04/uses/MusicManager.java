package com.ohgiraffers.section04.uses;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MusicManager {

    /* 음악 목록이 저장 되는 리스트  */
    private List<MusicDTO> musicList = new ArrayList<>();

    /* 파일 로드 */
    public void fileLoad() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("musicList.dat"))) {
            musicList = (List<MusicDTO>) ois.readObject();
        } catch (FileNotFoundException e) {
            musicList = new ArrayList<>();
        } catch (IOException e) {
            musicList = new ArrayList<>();
        } catch (ClassNotFoundException e) {
            musicList = new ArrayList<>();
        }
    }

    /* 파일 저장 */
    public void fileSave() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("musicList.dat"))) {
            oos.writeObject(musicList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* 곡 추가 */
    public void addList(MusicDTO music) {
        musicList.add(music);
    }

    /* 곡 전체 조회 */
    public List<MusicDTO> selectList() {

        return musicList;
    }

    /* 가수명 조회 */
    public List<MusicDTO> searchArtist(String artist) {

        /* 가수명을 검색해서 해당 키워드가 포함되는 곡을 리턴하기 위한 리스트 */
        List<MusicDTO> searchList = new ArrayList<>();

        for (MusicDTO music : musicList) {
            /* String 클래스의 contains() 메소드는 equals() 메소드와 달리 해당 문자 포함 여부를 boolean으로 리턴 */
            if (music.getArtist().contains(artist)) {
                searchList.add(music);
            }
        }

        return searchList;
    }

    /* 제목 조회 */
    public List<MusicDTO> searchTitle(String title) {

        /* 제목을 검색해서 해당 키워드가 포함되는 곡을 리턴하기 위한 리스트 */
        List<MusicDTO> searchList = new ArrayList<>();

        for (MusicDTO music : musicList) {
            if (music.getTitle().contains(title)) {
                searchList.add(music);
            }
        }

        return searchList;
    }

    /* 곡 수정  */
    public boolean updateMusic(MusicDTO updateMusic) {

        MusicDTO old = null;

        for (int i = 0; i < musicList.size(); i++) {
            /* musicList에서 id가 일치하는 music 객체를 찾는다. */
            if (musicList.get(i).getId() == updateMusic.getId()) {
                /* set 메소드는 수정 전 값을 반환한다. */
                old = musicList.set(i, updateMusic);
            }
        }

        /* 수정 전 값이 반환 되었으면 잘 수정 되었다는 의미로 true, 여전히 null이면 수정 된 적이 없다는 의미로 false를 반환한다. */
        return old != null;
    }

    /* 곡 삭제  */
    public boolean removeMusic(int id) {

        MusicDTO old = null;

        for (int i = 0; i < musicList.size(); i++) {
            /* musicList에서 id가 일치하는 music 객체를 찾는다. */
            if (musicList.get(i).getId() == id) {
                old = musicList.remove(i);
            }
        }

        return old != null;
    }
}
