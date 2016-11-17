# VScrollTextView

## 效果
![image](https://github.com/0wiky0/VScrollTextView/blob/master/screenshot/demo.gif)

## 使用
### 1. 设置需要轮播的文字，并开启动画
```
VScrollTextView vScrollTxtView = (VScrollTextView) findViewById(R.id.vScrollTV);
List<String> data = new ArrayList<>();
data.add("I have a pen");
data.add("I have an apple");
data.add("ah , Apple pen");
vScrollTxtView.setDataSource(data);
vScrollTxtView.startPlay();
```

### 2. VScrollTextView提供了几种自定属性：
- sleepTime : 动画间隔时间
- animDuration : 动画执行时间
- textSize : 文字大小
- textColor : 字体颜色
- singleLine : 显示单行
- scrollOrientation : 滚动的方向，目前只支持朝上（up）和朝下（down）
- eg:
```
 <com.wiky.vscrolltextview.VScrollTextView
            android:id="@+id/vScrollTV1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            vstv:sleepTime="1000"
            vstv:scrollOrientation="down"
            vstv:textColor="#ff0000"
            vstv:textSize="15sp" />
 ```
