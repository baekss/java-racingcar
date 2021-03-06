package step3.view;

import step3.domain.RacingCarGame;
import step3.domain.strategy.RandomMovingStrategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ResultViewTest {

    @Test
    @DisplayName("자동차 경주 결과 출력 테스트")
    void printRoundResultTest() {
        RacingCarGame racingCarGame = new RacingCarGame(3);

        for (int i = 0; i < 5; i++) {
            racingCarGame.play(new RandomMovingStrategy(3, 1));
            ResultView.getRoundResult(racingCarGame.getCars(), "-");
        }
    }

    @Test
    @DisplayName("자동차 이름과 경주 결과 출력 테스트")
    void printRoundResultWithNameTest() {
        RacingCarGame racingCarGame = new RacingCarGame(new String[]{"BLACK", "WHITE", "BLUE"});

        for (int i = 0; i < 5; i++) {
            racingCarGame.play(new RandomMovingStrategy(3, 1));
            ResultView.getRoundResultWithName(racingCarGame.getCars(), "-");
        }
    }

    @Test
    @DisplayName("자동차 경주 우승자 출력 테스트")
    void printWinnerTest() {
        RacingCarGame racingCarGame = new RacingCarGame(new String[]{"BLACK", "WHITE", "BLUE"});

        for (int i = 0; i < 5; i++) {
            racingCarGame.play(new RandomMovingStrategy(3, 1));
        }
        ResultView.printWinner(racingCarGame.getWinnerCarNames(), ", ");
    }
}
