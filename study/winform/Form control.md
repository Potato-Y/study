## 새로운 창 제어하기

Form1 과 Form2가 존재한다고 가정하자.</br>
```cs
Form2 newForm = new Form2();
newForm.ShowDialog();
```
다음 코드와 같이 되어있으면 Form2를 종료하기 전까지 Form1로 이동할 수 없게된다.
