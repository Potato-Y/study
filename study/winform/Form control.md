## winform

### 새로운 창 열기
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

### Form2_Load 하는 법
기본적으로 새로운 폼을 만들면 Form1 과 같이 Load가 자동으로 생기지 않는다. 하지만 이를 해주지 않으면 해당 페이지가 제대로 보이지 않을 수 있다. 때문에 이를 수동적으로 추가해줄 필요가 있다.
솔루션 탐색기 탭에서 **Form2.cs** 카테고리 하단에 보면 **Form2.Designer.cs**가 있다. 해당 텝으로 이동해주고,
```cs
 private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Text = "Form2";
        }
```
에서 새로운 코드를 기입해줘야 한다.

```cs
this.Load += new System.EventHandler(this.Form2_Load);
```
위 코드를 추가해주고, **Form2.cs**에 가서 Form1과 같이
```cs
private void Form2_Load(object sender, EventArgs e)  //프로그램 로딩
        { 
        
        }
```
위 코드를 추가해주면 된다.
