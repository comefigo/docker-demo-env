# 概要

Docker勉強会用サンプル

# 説明

- node･･･Node.jsのサンプルプログラム
- java･･･バージョン違い（JDK20と21）、ベースOS違い（corretto22）
- salesforce･･･Salesforceにおける開発環境

# 使い方

前提条件としてDocker Desktopをインストールしていること

## node

1. nodeディレクトリ配下に移動
1. `docker compose up -d`を実行
1. ブラウザで`localhost:3000`を実行
1. 終了時：docker compose down`を実行

## java、corretto22

1. VSCodeの[拡張機能 Remote Development](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.vscode-remote-extensionpack)をインストール
1. `.devcontainer`フォルダがあるディレクトリに移動
1. [Shift]+[Ctrl]+[P]で「Dev Containers:Rebuild and Reopen in container」