# engineers_gate_java_sample_mail

Engineers Gateの教材として、JavaMail APIを使用し、メール配信を行うサンプル実装になります。

## 目的

Javaでメール送信を行う実装において、<br>
サンプルコードとして参照していただくことを目的としております。<br>
<br>
※下記手順において、サンプルアプリを実行しても実際にメールが配信されることはありません。<br>
検証用のSMTPサーバ（FakeSMTP）を使用していますので、メール配信を行いたい場合は、<br>
配信可能なSMTPサーバに置き換えて検証を行ってください。

## 設計

使用した技術、実行環境及び設計は以下になります。

### 実行環境

- OS：Windows10
- IDE：Eclipse 2022-12
- Java：openjdk version "17.0.5" 2022-10-18
- JavaMail：javax.mail.jar 1.6.2
    - https://javaee.github.io/javamail/
    - ※libsフォルダに同梱済み。
- javax.activation.jar：1.2.0
    - https://github.com/javaee/activation/releases/tag/JAF-1_2_0
    - ※libsフォルダに同梱済み。
- FakeSMTP：2.0
    - http://nilhcem.com/FakeSMTP/download.html
    - ※appsフォルダに同梱済み。

## 実行方法

アプリ起動までの大まかな流れとしては、

1. git clone する。
1. Eclipseにプロジェクトをインポートする。
1. FakeSMTPを起動する。（※ローカル検証用のSMTPサーバを起動。）
1. Eclipseでサンプルアプリを実行。

の流れになります。<br>
詳しい手順は資料を用意しました。下記参照ください。

手順書： [EngineersGate__java_sample_mail_サンプルアプリケーションセットアップ.pdf](https://github.com/tomo-sato/engineers_gate_java_sample_mail/blob/main/doc/EngineersGate__java_sample_mail_%E3%82%B5%E3%83%B3%E3%83%97%E3%83%AB%E3%82%A2%E3%83%97%E3%83%AA%E3%82%B1%E3%83%BC%E3%82%B7%E3%83%A7%E3%83%B3%E3%82%BB%E3%83%83%E3%83%88%E3%82%A2%E3%83%83%E3%83%97.pdf)
