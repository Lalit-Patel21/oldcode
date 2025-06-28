

#================================================================================================================
# pip install firebase_admin
# pip install pyttsx3
# pip install wikipedia
# pip install pyautogui
# pip install keyboard
#---------------------------------------------------------------------------------------------------------------
import wikipedia
import webbrowser
import os
import pyttsx3    # for voice 
# import firebase_admin
# from firebase_admin import db
# import Assistant

#===============================================================================================================

class Assistant():

#     def __init__(self) -> None:
        
#         with open("D:\data.txt","r") as f:
#             a = f.readlines()
#             a = [_.strip() for _ in a]
#         self.data = a
#         self.email = a[0]
#         self.lock = a[2]
#         temp = self.email.split('@')
#         self.user = temp[0]

#         cred = firebase_admin.credentials.Certificate({
#   "type": "service_account",
#   "project_id": "ai-voice-assistant-36388",
#   "private_key_id": "4f6b96822c7159f58a8d77722199452a07509856",
#   "private_key": "-----BEGIN PRIVATE KEY-----\nMIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCU9/WdUbjhyDkc\nwTJ8SkRQGt5+HzR92aw4yiI06d3wtuUdOd+XfsrVZ+PkCeQgM+0cWtL18RbQGl0c\ns5U/CZALwiCW0bn8tWdAoULvtoNFL/XouJmaNGktqho3ktuBWgk5K75LlvTesgYw\nFJ/Z7CZ7k2djM2XCDvUV6AzM1yairgVTk3xe2Txx+32+3HB7MuVRnf9/MTBWT88u\n+BqA+H4JZtgM+eAVmC2HYPEqKbLBlkfAIii0artD2AyxNObLCL58Us6LsxImT+Ax\nxnYN4HZmh9rb5YxQjq2mfqnmMwizMjWWN7Ofv2V8Ue5q0/c8MY2u2mOnym9Cp2E5\nuN4ksSntAgMBAAECggEADpQouaV0jEYhzr5akD7daiCDC0FHDBT4LZOcnuSPV54y\nlHZkOymJtLJm41uTc5JZX2fFExQt2R5nY+ZwUfu/2OK9+TybsM9ZBEJz8E1CkgwU\nSxr7z1NXQsSNrcglysYytmFhTXj/zGaMQ/rUvQlHJ9tgaB0w1XnMwwDTdd2Ndqie\nblenf8B9RIVf/fEoRoOdKj1vLtwsVYmC8+QFCCf26AkIrRCQBo6JBr9ZhR4yik5y\nCOh3g5qIBsuqwOF0vOv+Tds7YJgF+2Pjr14GXNo/JqwvA9XzQzWgwez7PwL1ztkg\nrEQa/z/cyBym4OCyc/yy+qLbVyf/y37/HU5DPc4FkQKBgQDN7qTf5ivllzbazEb+\nc3EuwCIcWQ/7dOgGITakoWU5u4/mUzf+5NTHixVWgnvYrDm1uaa5FQJe8IRFeEeI\n27ktS7SuFUW/olZz7qq7zKG9oRMHhXyK3y4FPyOVe6NsTJEC5blrF8jgfyVDa97f\ndqIOf0j6LkGgXGqdHmC8M7KmnQKBgQC5L9zYgZQVL2uoO8pffkbHtRLQ7SNN5fjG\nNrgDirzYUOpYF3yGaSZSkOGNIBd6h1E9uOik/sVdmYTKe8Pmuc53KW6Cf7skYMuH\nSzZmq1pIS9MEAx7Z3I07vrp/dOFsIdwpFZXAm+LCvMFrM6lAqBFb8rcfNrlviNEA\nzefSbfSHkQKBgGt7qXZrTnIQ0MK2aD+axXJfOe6N1berNwcsArc+vfS6HstamBlk\nGmLkBwkWJcnbamudMJXdj1U6N++CbePSuv4XS4Co/bSd6H2uDlLi5XByR9pfI7ff\n8McwQ0RcOdnmxLE8ceChk2kJM8vS24rLAp6KdO6PghVO5x6GonrYiOBJAoGAMmP0\nuzEfQ1iA+ekzGyL4TZVXBmTQq3y9Yeo3zjbtRgtWiRvy9XwdQnBL/6PQ37V8hMgQ\n/fyZZevFN3fQCbNbnA85E+d/29k+6JStu+g6i9ueEsRqm6uo/q3af54lTNA14TQP\naLbCUG0eUHZhQse42YVFEQhKEzBudsKQpzDmThECgYADug7E7sy8gcnznR+Xi0lM\nJIwSQBxK+DxfNvrQqMhB4Y3CLpxyoFRZW7CnhKht4bJqN6uyjbn0j4cTsVln0tn5\nSOve0m2knRFVOqtUUBQ8MoUApdL+7bfim/d0J99CGTxRx1a6AhbbE02017RKrq71\n9ZscCdVhmM0KW1V2lI3ckw==\n-----END PRIVATE KEY-----\n",
#   "client_email": "firebase-adminsdk-fhxo6@ai-voice-assistant-36388.iam.gserviceaccount.com",
#   "client_id": "113892870993408568076",
#   "auth_uri": "https://accounts.google.com/o/oauth2/auth",
#   "token_uri": "https://oauth2.googleapis.com/token",
#   "auth_provider_x509_cert_url": "https://www.googleapis.com/oauth2/v1/certs",
#   "client_x509_cert_url": "https://www.googleapis.com/robot/v1/metadata/x509/firebase-adminsdk-fhxo6%40ai-voice-assistant-36388.iam.gserviceaccount.com"
# })
        # app = firebase_admin.initialize_app(cred, {'databaseURL': 'https://ai-voice-assistant-36388-default-rtdb.firebaseio.com/'})
        # self.database = db.reference('/users/')

        # self.engine = pyttsx3.init('sapi5')
        # voices = self.engine.getProperty('voices')
        # self.engine.setProperty('voice', voices[1].id)
        # self.web = webbrowser.get("chrome")
#------------------------------------------------------------------------------------------------------------
    # functions

    def speak(self, audio):
        self.engine.say(audio)
        self.engine.runAndWait()


    def resetData(self):
        self.database.child(self.user).update({"query":"null"})

    def openGoogle(self):
        self.engine.say("opening google")
        self.engine.runAndWait()
        webbrowser.get("chrome").open('google.com')

    def openYoutube(self):
        self.engine.say("opening youtube")
        self.engine.runAndWait()
        self.web.open("youtube.com")

    def wikipedia (self, data):
        self.engine.say("searching wikipedia")
        self.engine.runAndWait()
        data = data.replace("wikipedia","")
        results = wikipedia.summary(data, sentences=1)
        self.engine.say("according to wikipedia...")
        self.engine.say(results)
        self.engine.runAndWait()


    def shutdown(self):
        self.engine.say("shutingdown windows")
        



#==========================================================================================================================

def takeInput(obj):
    print('listning')
    while True:
        query = obj.database.child(obj.user).child("query").get()
        query = query.lower()

        if ("open google" in query):
            obj.openGoogle()
            obj.resetData()
        elif ("open youtube" in query):
            obj.openYoutube()
            obj.resetData()
        elif ("wikipedia" in query):
            obj.wikipedia(query)
            obj.resetData()
        elif ("shutdown"in query):
            obj.speak("shuttingdown windows")
            obj.resetData()
            os.system("shutdown /s /t 1")
        else:
            if(query != "null"):
                obj.speak(query)


#=========================================================================================================================


if __name__ == '__main__':
    webbrowser.register('chrome', None,
                    webbrowser.BackgroundBrowser("C://Program Files//Google//Chrome//Application//chrome.exe"))

    

    b = Assistant()

    takeInput(b)
