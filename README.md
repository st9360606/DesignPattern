# DesignPattern 🎨

> Java 設計原則與設計模式教學範例（可執行、可測試、含註解）。  
> 目前已包含 **狀態模式（State Pattern）** 的抽獎機器範例，後續將逐步擴充其他模式。  
> 技術棧：**JDK 17 + Maven**，適合初學者逐步練習並延伸到實務專案。

---

## ✨ TL;DR

- 採用 **JDK 17 + Maven**，每一種設計模式一個子 package。  
- 每個範例皆含 `ClientTest`，可直接執行觀察結果。  
- 範例設計原則：**可讀性高、可執行、避免副作用方法**。  
- 已完成：**State Pattern 抽獎機器** → 狀態流轉：  
  `NoRaffle → CanRaffle → Dispense → DispenseOut`  
- 規劃提供 **Backlog / 驗收準則**，協助循序擴充其他模式（Factory、Singleton、Strategy...）。

---

## 📂 專案結構
```plaintext
DesignPattern/
├─ pom.xml
├─ .gitignore
├─ .idea/                  # IntelliJ 專案設定
├─ .fastRequest/config/    # REST 插件設定（可選）
└─ src/
   └─ main/
      └─ java/
         └─ com/example/pattern/
            ├─ state/                  # 狀態模式（抽獎機器範例）
            │  ├─ State.java
            │  ├─ NoRaffleState.java
            │  ├─ CanRaffleState.java
            │  ├─ DispenseState.java
            │  ├─ DispenseOutState.java
            │  ├─ RaffleActivity.java
            │  └─ ClientTest.java
            └─ (未來模式例如)
               ├─ singleton/
               ├─ factory/
               ├─ strategy/
               └─ observer/

🛠️ 開發環境
JDK：17
建置工具：Maven 3.8+
IDE：IntelliJ IDEA（建議社群版即可）
編碼：UTF-8

🚀 快速開始
1️⃣ 取得程式碼
git clone https://github.com/st9360606/DesignPattern.git
cd DesignPattern

2️⃣ 編譯 & 測試
mvn -q -DskipTests=false test

3️⃣ 執行範例（以 State Pattern 為例）
在 IDE 中執行：
com.example.pattern.state.ClientTest

🎯 狀態模式範例簡介
意圖：將「抽獎活動」的行為依「狀態」封裝在獨立類別，避免多層 if/else。

主要角色：
State：抽象狀態，定義 deductMoney()、raffle()、dispensePrize()。
RaffleActivity：活動上下文（Context），持有當前狀態與獎品數量。

四種狀態類：
NoRaffleState（未扣分，不能抽）
CanRaffleState（已扣分，可以抽）
DispenseState（中獎，發放獎品）
DispenseOutState（獎品發完，活動結束）


📝 待辦清單 (Backlog)
| ID | User Story                | 驗收準則                                | 估點  |
| -- | ------------------        | ----------------------------------     | --- |
| P1 | `getCount()` 無副作用      | 重複呼叫不改變庫存                       | 1   |
| P2 | 發獎時才遞減庫存            | 中獎後才 `count--`                      | 1   |
| P3 | 正確狀態切換               | 扣完最後一個獎品即轉 `DispenseOutState`   | 1   |
| P4 | ClientTest 防呆退出        | 進入 `DispenseOutState` 即 `break`       | 0.5 |
| P5 | 新增 JUnit5 測試           | `count=1/2` 情境測試綠燈                  | 2   |
| P6 | 擴充其他模式（Strategy 等） | 新增 `strategy/` package 並能執行         | 2   |


⚠️ 風險提示與替代方案
副作用風險：避免在 getCount() 內修改狀態，應讀寫分離。
流程退出：避免 System.exit(0)，應透過狀態切換與 break 收斂流程。
多執行緒：若未來支援並行抽獎，需用同步或 AtomicInteger 確保安全。
測試覆蓋：建議為 count=0/1/2 寫單元測試確保正確性。
