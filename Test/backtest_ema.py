import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# ---------------- Settings ----------------
np.random.seed(42)  # reproducible randomness
days = 60           # number of days
start_price = 1000  # initial price
ema_period = 10     # EMA period
# ------------------------------------------

# 1️⃣ Generate random walk price data
price = [start_price]
for _ in range(days-1):
    change = np.random.normal(loc=0, scale=10)  # daily random change
    price.append(price[-1] + change)

data = pd.DataFrame({'Close': price})
data['Day'] = range(1, days+1)

# 2️⃣ Calculate EMA
data['EMA10'] = data['Close'].ewm(span=ema_period, adjust=False).mean()

# 3️⃣ Cool plotting
plt.figure(figsize=(12,6))
plt.plot(data['Day'], data['Close'], label='Price', color='blue', linewidth=2)
plt.plot(data['Day'], data['EMA10'], label='EMA10', color='orange', linewidth=2)
plt.fill_between(data['Day'], data['Close'], data['EMA10'], 
                 where=(data['Close']>data['EMA10']), color='green', alpha=0.2, label='Above EMA')
plt.fill_between(data['Day'], data['Close'], data['EMA10'], 
                 where=(data['Close']<data['EMA10']), color='red', alpha=0.2, label='Below EMA')

plt.title("Cool Price + EMA Visualization 🚀")
plt.xlabel("Day")
plt.ylabel("Price")
plt.legend()
plt.grid(True)
plt.show()
