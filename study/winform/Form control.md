## 새로운 창 제어하기

Form1 과 Form2가 존재한다고 가정하자.</br>
```cs
Form2 newForm = new Form2();
newForm.ShowDialog();
```
다음 코드와 같이 되어있으면 Form2를 종료하기 전까지 Form1로 이동할 수 없게된다.

```cs
Form2 newForm = new Form2();
newForm.Show();
```
그러나 위와 같이 코드가 작성되어 있으면 Form1과 Form2 모두 동시에 사용 가능하다.

열린 폼을 종료하려면
```cs
private void button1_Click(object sender, EventArgs e)
        {
            this.Close();
        }
```
위와 같은 코드를 사용해주면 된다.
