// swing 프로그램을 위해 필요한 컴포넌트 클래스 및 그래픽을 위한 클래스를 import
import javax.swing.*;
import java.awt.*;

public class Final extends JFrame {
    private JTextArea resultArea;

    public Final() {
        setTitle("구구단 출력기"); // 타이틀에 '구구단 출력기'라고 나오도록 작성
        setSize(500, 400); // 윈도우의 크기를 500 x 400으로 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 우측 상당의 X아이콘을 클릭하면 프로그램이 종료
        setLocationRelativeTo(null);

        // 패널 생성
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // 결과 출력 영역
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        panel.add(scrollPane, BorderLayout.CENTER);
        add(panel);

        printGugudan();
    }

    private void printGugudan() {
            for(int i = 1; i < 10; i++) { // 단에 대한 반복 (1단에서 9단)
                for(int j = 1; j < 10; j++) { // 각 단의 곱셈
                    System.out.print(i + "*" + j + "=" + i*j); // 구구단 출력
                    System.out.print('\t'); // 하나씩 탭으로 띄우기
            }
    }
}
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            new Final(); // 결과 화면의 윈도우 출력
            } 
        });
    }
}
