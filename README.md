# LearnAndroidArch

我想要通过Dagger实现  mall 与 loan模块之间的解耦合, 并且实现懒加载。

参考链接：
1. [Dagger2官网](https://developer.android.com/training/dependency-injection/dagger-android?hl=zh-cn)

a. 先使用spi 实现一个从 vip 到 loan模块的穿透。简称： VipInfoView(VipInfo):View  --> toLoan 这里突然意识到我们的网络库也做的不好。不好之处自在于没有解耦支持；
                                               VipInfoView():View  --> toLoan
