# 記得先裝flask (pip install flask)
from flask import Flask, jsonify

app = Flask(__name__)
app.json.ensure_ascii = False
name = "哈哈哈" 


@app.get("/api/name")
def get_name():
    return jsonify({
        "name": name
    })


if __name__ == "__main__":
    app.run(debug=True)