package bridge;

import static camp.nextstep.edu.missionutils.Console.*;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
	
	static final String INPUT_SIZE_MESSAGE = "다리의 길이를 입력해주세요.";
	static final String INPUT_MOVE_MESSAGE = "이동할 칸을 선택해주세요. (위: U, 아래: D)";
	static final String INPUT_RETRY_MESSAGE = "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)";
    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
    	System.out.println(INPUT_SIZE_MESSAGE);
    	int inputSize = Integer.parseInt(readLine().replace(" ", ""));
        return inputSize;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
    	System.out.println(INPUT_MOVE_MESSAGE);
    	String inputMoving = readLine().replace(" ", "");
        return inputMoving;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
    	System.out.println(INPUT_RETRY_MESSAGE);
    	String inputCommand = readLine().replace(" ", "");
        return inputCommand;
    }
}
