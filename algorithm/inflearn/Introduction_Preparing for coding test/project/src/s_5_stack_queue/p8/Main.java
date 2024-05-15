package s_5_stack_queue.p8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    Queue<Patient> queue = new LinkedList<>();
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      queue.add(new Patient(st.nextToken(), i == m));
    }

    int count = 0;
    while (!queue.isEmpty()) {
      Patient tmp = queue.poll();
      for (Patient p : queue) {
        if (p.emergency > tmp.emergency) {
          queue.add(tmp);
          tmp = null;
          break;
        }
      }
      if (tmp != null) {
        count++;
        if (tmp.tracking) {
          System.out.println(count);
        }
      }
    }
  }
}

class Patient {

  public int emergency;
  public boolean tracking;

  public Patient(String emergency, boolean tracking) {
    this.emergency = Integer.parseInt(emergency);
    this.tracking = tracking;
  }
}
