package Chapter8;

public class Ex8_6 {
  public static void main(String[] args) {
    try {
      startInstall(); // 설치는 예외상황이 발생할 수도 있는 위험한 문장임을 가정
    } catch (SpaceException e) {
      System.out.println(e.getMessage());
    } catch (MemoryException e) {
      System.out.println(e.getMessage());
    } finally { // try, catch 문장 후에 반드시 처리하고 넘어가야 할 문장을 여기에 적음
      deleteTempFiles();
    }
  }

  static void startInstall() throws SpaceException, MemoryException {
    if(!enoughSpace()) {
      throw new SpaceException("공간을 확보해라");
    }
    if(!enoughMemory()) {
      throw new MemoryException("메모리 없다 다시해라");
    }
  }

  static boolean enoughSpace() {
    return true;
  }
  static boolean enoughMemory() {
    return false;
  }

  static void deleteTempFiles() {}
}


// Exception 정의, 부모 클래스 상속
class SpaceException extends Exception {
  public SpaceException(String message) {
    super(message);
  }
}

class MemoryException extends Exception {
  public MemoryException(String message) {
    super(message);
  }
}