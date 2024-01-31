package com.ohgiraffers.section03.grammar;

public enum FoodsEnum {
    /* 작성 순서대로 0부터 값이 자동으로 부여 된다. */
    MEAL_AN_BUTTER_KIMCHI_STEW(0,"앙버터김치찜"),
    MEAL_MINT_SEAWEED_SOUP(1, "민트미역국"),
    MEAL_BUNGEOPPANG_SUSHI(2,"붕어빵초밥"),
    DRINK_RADISH_KIMCHI_LATTE(0, "열무김치라떼"),
    DRINK_WOOLUCK_SMOOTHIE(1,"우럭스무디"),
    DRINK_RAW_CUTTLEFISH_SHAKE(2, "생갈치쉐이크"); //enum 라인이 끝났다는 걸 표시 (구분)

    private final int value;
    private final String name;

    FoodsEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
