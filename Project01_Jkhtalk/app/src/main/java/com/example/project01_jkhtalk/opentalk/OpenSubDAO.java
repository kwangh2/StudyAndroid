package com.example.project01_jkhtalk.opentalk;

import com.example.project01_jkhtalk.R;

import java.util.ArrayList;

public class OpenSubDAO {
    public ArrayList<OpenSubDTOs.OpenSub1DTO> getOpenSub1List(){
        ArrayList<OpenSubDTOs.OpenSub1DTO> list = new ArrayList<>();
        list.add(new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_back_img , 1500 , "[광주광역시 정보] 광주전남 정보", "사진 3장을 보냈습니다.","오전 11:13"));
        list.add(new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_back_img_2 , 30000 , "[전국] 실시간 기상상황", "읏추읏추","오전 10:13"));
        list.add(new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_back_img_3 , 1500 , "[감사일기] 오늘도 한줄", "사진 1장을 보냈습니다.","오전 11:02"));
        list.add(new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_back_img_4 , 1500 , "[끝말잇기] 자유로운 끝말잇기", "해질녘","2월 4일"));
        list.add(new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_back_img_5 , 1500 , "[수다방] MBTI 수다방", "사진 3장을 보냈습니다.","12:00"));
        return list;
    }
    public  ArrayList<OpenSubDTOs.OpenSub2DTO> getOpenSub2List(){
        ArrayList<OpenSubDTOs.OpenSub2DTO> list  = new ArrayList<>();
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_profile_img, 1000,"다이어트! 물단식 간헐적 단식 식단","방금 대화" ,new String[]{"#다이어트","#다이어트식단","#간헐적단식","#물단식"}));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_profile_img_2, 800,"다이어트 공유방","1시간 전" ,new String[]{"#다이어트","#혈당관리","#간헐적단식","#물단식"}));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_profile_img_3, 900,"몽글몽글 학생 다이어트 방","방금 대화" ,new String[]{"#다이어트","#초등학생","#중학생","#환영합니다"}));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_profile_img_4, 500,"쇠질은 인생이야","방금 대화" ,new String[]{"#헬스","#크로스핏","#헬창","#오운"}));
        return list;
    }
    public  ArrayList<OpenSubDTOs.OpenSub2DTO> getOpenSub3List(){
        ArrayList<OpenSubDTOs.OpenSub2DTO> list  = new ArrayList<>();
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_profile_img, 1000,"제주사진모임 pick크닉","방금 대화" ,new String[]{"#제주사진","#풍경사진","#인물사진","#취미사진"}));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_profile_img_2, 800,"대구경북 사진러브","30분 전" ,new String[]{"#대구","#경북","#사진","#동아리", "#캐논", "#소니"}));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_profile_img_3, 200,"사진공방 : 사진을 만드는 사람들 ","방금 대화" ,new String[]{"#캐논","#니콘","#소니","#후지","#올림푸스","#펜탁스"}));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.friend_profile_img_4, 500,"끝나면 고기먹으러 가는 사진방","방금 대화" ,new String[]{"#사진","#포토","#경남","#창원","#마산","#김해","#부산"}));
        return list;
    }
    public ArrayList<OpenSubDTOs.OpenSub3DTO> getOpenSub4List(){
        ArrayList<OpenSubDTOs.OpenSub3DTO> list  = new ArrayList<>();
        list.add(new OpenSubDTOs().new OpenSub3DTO(R.drawable.img1,300,"2차전지투자(현재배터리 IR)","방금 대화"));
        list.add(new OpenSubDTOs().new OpenSub3DTO(R.drawable.img1,300,"2차전지투자(현재배터리 IR)","방금 대화"));
        list.add(new OpenSubDTOs().new OpenSub3DTO(R.drawable.img1,300,"2차전지투자(현재배터리 IR)","방금 대화"));
        return list;
    }
}
