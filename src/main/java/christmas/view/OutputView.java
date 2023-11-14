package christmas.view;

import christmas.dto.response.OrderedMenuResponse;

import java.util.List;

public class OutputView {

    private OutputView() {

    }

    public static void printIntroductionMessage() {
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
    }

    public static void printPreviewIntroductionMessage() {
        System.out.printf("12월 %d일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!", 26);
    }

    public static void printOrderedMenusMessage(List<OrderedMenuResponse> orderedMenus) {
        System.out.println();
        orderedMenus.forEach(orderedMenu -> System.out.printf("%s %d개", orderedMenu.getName(), orderedMenu.getQuantity()));
    }
}
