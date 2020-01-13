package templates.authentication.passwordrecovery


layout 'authentication/AuthenticationMain.groovy',
        pageTitle: 'Batch Manager | Forgot Password',
        withBodyClasses: 'hold-transition login-page',
        boxType: 'login-box',
        mainBody: contents {
            include unescaped: 'authentication/passwordrecovery/ForgotPasswordBody.vfm'
        }
